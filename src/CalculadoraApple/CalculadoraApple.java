package CalculadoraApple;


public class CalculadoraApple extends javax.swing.JFrame {
    
    public float primerNumero;
    public float segundoNumero;
    public String operador;
    
    
    public CalculadoraApple() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        casilla = new javax.swing.JLabel();
        btn_ac = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_cosecante = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_seno = new javax.swing.JButton();
        btn_coseno = new javax.swing.JButton();
        btn_tangente = new javax.swing.JButton();
        btn_cotangente = new javax.swing.JButton();
        btn_secante = new javax.swing.JButton();
        btn_euler = new javax.swing.JButton();
        btn_pi = new javax.swing.JButton();
        btn_parentesisDer = new javax.swing.JButton();
        btn_parentesisIzq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(240, 240, 240));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 24, 340, 40));

        casilla.setFont(new java.awt.Font("Microsoft JhengHei", 0, 48)); // NOI18N
        casilla.setForeground(new java.awt.Color(240, 240, 240));
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(casilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 340, 44));

        btn_ac.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_ac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        btn_ac.setText("AC");
        btn_ac.setFocusPainted(false);
        btn_ac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ac.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        btn_ac.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presionado.png"))); // NOI18N
        btn_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 50));

        btn_exp.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        btn_exp.setText("^");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presionado.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1_presionado.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 50, 50));

        btn_igual.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3_presionado.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel1.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 50, 50));

        btn_cosecante.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_cosecante.setForeground(new java.awt.Color(255, 255, 255));
        btn_cosecante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_cosecante.setText("csc");
        btn_cosecante.setFocusPainted(false);
        btn_cosecante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cosecante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_cosecante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_cosecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosecanteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cosecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 50));

        btn_8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 50, 50));

        btn_9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 50, 50));

        btn_6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 50, 50));

        btn_5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 50, 50));

        btn_4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 50, 50));

        btn_1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 50, 50));

        btn_2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 50, 50));

        btn_3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 50, 50));

        btn_punto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(255, 255, 255));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 50, 50));

        btn_division.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_division.setForeground(new java.awt.Color(255, 255, 255));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_division.setText("÷");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3_presionado.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 50, 50));

        btn_multiplicacion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_multiplicacion.setText("x");
        btn_multiplicacion.setFocusPainted(false);
        btn_multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3_presionado.png"))); // NOI18N
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 50, 50));

        btn_resta.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3_presionado.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 50, 50));

        btn_suma.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton3_presionado.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 50, 50));

        btn_0.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton4.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton4.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton4_presionado.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 100, 50));

        btn_7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, 50));

        btn_seno.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        btn_seno.setForeground(new java.awt.Color(255, 255, 255));
        btn_seno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_seno.setText("sin");
        btn_seno.setFocusPainted(false);
        btn_seno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_seno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_seno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_senoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 50));

        btn_coseno.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        btn_coseno.setForeground(new java.awt.Color(255, 255, 255));
        btn_coseno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_coseno.setText("cos");
        btn_coseno.setFocusPainted(false);
        btn_coseno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_coseno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_coseno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosenoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_coseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 50, 50));

        btn_tangente.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        btn_tangente.setForeground(new java.awt.Color(255, 255, 255));
        btn_tangente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_tangente.setText("tan");
        btn_tangente.setFocusPainted(false);
        btn_tangente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tangente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_tangente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tangenteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 50, 50));

        btn_cotangente.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        btn_cotangente.setForeground(new java.awt.Color(255, 255, 255));
        btn_cotangente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_cotangente.setText("cot");
        btn_cotangente.setFocusPainted(false);
        btn_cotangente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cotangente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_cotangente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_cotangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cotangenteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cotangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, 50));

        btn_secante.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        btn_secante.setForeground(new java.awt.Color(255, 255, 255));
        btn_secante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_secante.setText("sec");
        btn_secante.setFocusPainted(false);
        btn_secante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_secante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_secante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_secante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_secanteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_secante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, 50));

        btn_euler.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_euler.setForeground(new java.awt.Color(255, 255, 255));
        btn_euler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_euler.setText("e");
        btn_euler.setFocusPainted(false);
        btn_euler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_euler.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_euler.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_euler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eulerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_euler, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 50, 50));

        btn_pi.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btn_pi.setForeground(new java.awt.Color(255, 255, 255));
        btn_pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_pi.setText("π");
        btn_pi.setFocusPainted(false);
        btn_pi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_pi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_piActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 50, 50));

        btn_parentesisDer.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btn_parentesisDer.setForeground(new java.awt.Color(255, 255, 255));
        btn_parentesisDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_parentesisDer.setText("^3");
        btn_parentesisDer.setFocusPainted(false);
        btn_parentesisDer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_parentesisDer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_parentesisDer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_parentesisDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parentesisDerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_parentesisDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, 50));

        btn_parentesisIzq.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btn_parentesisIzq.setForeground(new java.awt.Color(255, 255, 255));
        btn_parentesisIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_parentesisIzq.setText("^2");
        btn_parentesisIzq.setFocusPainted(false);
        btn_parentesisIzq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_parentesisIzq.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2.png"))); // NOI18N
        btn_parentesisIzq.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton2_presionado.png"))); // NOI18N
        btn_parentesisIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parentesisIzqActionPerformed(evt);
            }
        });
        jPanel1.add(btn_parentesisIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acActionPerformed
        this.casilla.setText("");
    }//GEN-LAST:event_btn_acActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "^";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "%";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        this.segundoNumero = Float.parseFloat(this.casilla.getText());
        switch(this.operador){
            case "+":
                this.casilla.setText(sinCero(this.primerNumero + this.segundoNumero));
                break;
            case "-":
                this.casilla.setText(sinCero(this.primerNumero - this.segundoNumero));
                break;
            case "*":
                this.casilla.setText(sinCero(this.primerNumero * this.segundoNumero));
                break;
            case "/":
                this.casilla.setText(sinCero(this.primerNumero / this.segundoNumero));
                break;
            case "%":
                this.casilla.setText(sinCero(this.primerNumero % this.segundoNumero));
                break;
            case "^":
                this.casilla.setText(sinCero((float) Math.pow(this.primerNumero, this.segundoNumero)));
                break;
            case "^2":
                this.casilla.setText(sinCero((float) Math.pow(this.primerNumero, 2)));
                break;
            case "^3":
                this.casilla.setText(sinCero((float) Math.pow(this.primerNumero, 3)));
                break;
            case "sin":
                this.casilla.setText(sinCero((float) Math.sin(this.segundoNumero)));
                break;
            case "cos":
                this.casilla.setText(sinCero((float) Math.cos(this.segundoNumero)));
                break;
            case "tan":
                this.casilla.setText(sinCero((float) Math.tan(this.segundoNumero)));
                break;
            case "cot":
                this.casilla.setText(sinCero((float) (1 / Math.tan(this.segundoNumero))));
                break;
            case "sec":
                this.casilla.setText(sinCero((float) (1 / Math.cos(this.segundoNumero))));
                break;
            case "csc":
                this.casilla.setText(sinCero((float) (1 / Math.sin(this.segundoNumero))));
                break;
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_cosecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosecanteActionPerformed
        this.operador = "csc";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_cosecanteActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        this.casilla.setText(this.casilla.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        this.casilla.setText(this.casilla.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        this.casilla.setText(this.casilla.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        this.casilla.setText(this.casilla.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        this.casilla.setText(this.casilla.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        this.casilla.setText(this.casilla.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        this.casilla.setText(this.casilla.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        this.casilla.setText(this.casilla.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if(!(this.casilla.getText().contains("."))){
            this.casilla.setText(this.casilla.getText() + ".");
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "/";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "*";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "-";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "+";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        this.casilla.setText(this.casilla.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        this.casilla.setText(this.casilla.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_senoActionPerformed
        this.operador = "sin";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_senoActionPerformed

    private void btn_cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosenoActionPerformed
        this.operador = "cos";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_cosenoActionPerformed

    private void btn_tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tangenteActionPerformed
        this.operador = "tan";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_tangenteActionPerformed

    private void btn_cotangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cotangenteActionPerformed
        this.operador = "cot";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_cotangenteActionPerformed

    private void btn_secanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_secanteActionPerformed
        this.operador = "sec";
        this.casilla.setText("");
    }//GEN-LAST:event_btn_secanteActionPerformed

    private void btn_eulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eulerActionPerformed
        this.casilla.setText(this.casilla.getText() + "2.71828182");
    }//GEN-LAST:event_btn_eulerActionPerformed

    private void btn_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_piActionPerformed
        this.casilla.setText(this.casilla.getText() + "3.14159265");
    }//GEN-LAST:event_btn_piActionPerformed

    private void btn_parentesisDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parentesisDerActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "^3";
    }//GEN-LAST:event_btn_parentesisDerActionPerformed

    private void btn_parentesisIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parentesisIzqActionPerformed
        this.primerNumero = Float.parseFloat(this.casilla.getText());
        this.operador = "^2";
    }//GEN-LAST:event_btn_parentesisIzqActionPerformed

    
    public String sinCero(float resultado){
        String retorno = "";
        
        retorno = Float.toString(resultado);
        
        if(resultado % 1 == 0){
            retorno = retorno.substring(0, retorno.length()-2);
        }
        
        return retorno;
    }
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraApple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraApple().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_ac;
    private javax.swing.JButton btn_cosecante;
    private javax.swing.JButton btn_coseno;
    private javax.swing.JButton btn_cotangente;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_euler;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_parentesisDer;
    private javax.swing.JButton btn_parentesisIzq;
    private javax.swing.JButton btn_pi;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_secante;
    private javax.swing.JButton btn_seno;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tangente;
    private javax.swing.JLabel casilla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtOperacion;
    // End of variables declaration//GEN-END:variables
}
