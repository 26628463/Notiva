package feed;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Feed extends JFrame {

    private JTextField textField;

    public Feed() {
        initialize();
    }

    private void initialize() {
        setTitle("Feed");
        setBounds(100, 100, 940, 560);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0, 0, 1051, 21);
        getContentPane().add(toolBar);

        JButton btnDashboard = new JButton("Dashboard");
        btnDashboard.setEnabled(false);
        toolBar.add(btnDashboard);

        JButton btnTareas = new JButton("Tareas");
        btnTareas.setEnabled(false);
        toolBar.add(btnTareas);

        JButton btnFeed = new JButton("Feed");
        btnFeed.setEnabled(true);
        toolBar.add(btnFeed);

        JButton btnPerfil = new JButton("Perfil");
        btnPerfil.setEnabled(false);
        toolBar.add(btnPerfil);

        JButton btnNotas = new JButton("Notas");
        btnNotas.setEnabled(false);
        toolBar.add(btnNotas);

        JButton btnCerrarSesion = new JButton("Cerrar sesión");
        btnCerrarSesion.setEnabled(false);
        toolBar.add(btnCerrarSesion);

        JPanel panelLateral = new JPanel();
        panelLateral.setBounds(692, 21, 222, 489);
        panelLateral.setBackground(new Color(192, 192, 192));
        panelLateral.setLayout(null);
        getContentPane().add(panelLateral);

        textField = new JTextField();
        textField.setBounds(8, 11, 103, 20);
        panelLateral.add(textField);
        textField.setColumns(10);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(Color.WHITE);
        btnBuscar.setBounds(121, 10, 75, 23);
        panelLateral.add(btnBuscar);

        JPanel panelAmigos = new JPanel();
        panelAmigos.setBackground(new Color(255, 128, 192));
        panelAmigos.setPreferredSize(new Dimension(220, 600));
        
        JScrollPane scrollAmigos = new JScrollPane(panelAmigos);
        scrollAmigos.setBounds(0, 71, 222, 418);
        scrollAmigos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelLateral.add(scrollAmigos);
        panelAmigos.setLayout(null);


        JLabel lblAmigos = new JLabel("Amigos");
        lblAmigos.setBounds(78, 10, 68, 23);
        lblAmigos.setFont(new Font("Tahoma", Font.BOLD, 14));
        panelAmigos.add(lblAmigos);

        ImageIcon iconoM = new ImageIcon(getClass().getResource("/iconos/amigos.png"));
        Image imagen = iconoM.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoA = new ImageIcon(imagen);

        JLabel lblIconoAmigos = new JLabel("", iconoA, JLabel.LEFT);
        lblIconoAmigos.setBounds(21, 4, 59, 50);
        panelAmigos.add(lblIconoAmigos);

        JPanel panelFeed = new JPanel();
        panelFeed.setBackground(new Color(64, 128, 140));
        panelFeed.setPreferredSize(new Dimension(580, 1500));
        panelFeed.setLayout(null);

        JLabel lblMensaje = new JLabel("Comparte tus experiencias con tus amigos");
        lblMensaje.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
        lblMensaje.setBounds(50, 20, 480, 30);
        panelFeed.add(lblMensaje);

        JScrollPane scrollPane = new JScrollPane(panelFeed);
        scrollPane.setBounds(10, 31, 672, 479); 
        getContentPane().add(scrollPane);
        
        
    }
}