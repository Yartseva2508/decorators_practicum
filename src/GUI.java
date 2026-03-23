import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    private static final int LIMIT = 3;
    private static final List<String> history = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Таверна: Меню (макс. 3)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        String[] options = {
                "Огненный соус (+10)",
                "Двойная оленина (+20)",
                "Снежные ягоды (+5)",
                "Нордская лепешка (+7)"
        };

        List<JCheckBox> boxes = new ArrayList<>();

        for (String text : options) {
            JCheckBox cb = new JCheckBox(text);
            cb.addActionListener(e -> {
                long count = boxes.stream().filter(JCheckBox::isSelected).count();
                boxes.forEach(box -> {
                    if (!box.isSelected()) box.setEnabled(count < LIMIT);
                });
            });
            boxes.add(cb);
            frame.add(cb);
        }

        JButton btnAdd = new JButton("Заказать");
        btnAdd.addActionListener(e -> {
            Dish finalOrder = new BaseDish();

            if (boxes.get(0).isSelected()) finalOrder = new SauseDecorator(finalOrder);
            if (boxes.get(1).isSelected()) finalOrder = new MeatDeerDecorator(finalOrder);
            if (boxes.get(2).isSelected()) finalOrder = new BerriesDecorator(finalOrder);
            if (boxes.get(3).isSelected()) finalOrder = new NordicBread(finalOrder);

            String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            String info = finalOrder.getName() + " | Цена: " + finalOrder.getPrice() + " септимов";

            history.add(time + " -> " + info);
            JOptionPane.showMessageDialog(frame, "Ваш заказ:\n" + info);
        });

        JButton btnLogs = new JButton("История");
        btnLogs.addActionListener(e -> {
            if (history.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Заказов еще не было.");
            } else {
                JOptionPane.showMessageDialog(frame, String.join("\n", history));
            }
        });

        frame.add(btnAdd);
        frame.add(btnLogs);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}