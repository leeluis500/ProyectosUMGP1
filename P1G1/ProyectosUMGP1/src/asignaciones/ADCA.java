/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro
 */
public class ADCA extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADCA
     */
    public ADCA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cod_carrera = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cod_sede = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cod_jornada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cod_seccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cod_aula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cod_curso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        car_alumno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nota_asig = new javax.swing.JTextField();
        Label_status = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("ASIGNACIÓN DE CURSOS A ALUMNOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Código de carrera:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Código de sede:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Código de jornada:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Código de sección:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Código de aula:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Código de curso:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Carnet del alumno:");

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ASIGNAR / GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BUSCAR ASIGNACIÓN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nota asignada:");

        Label_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_status.setText("...");

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("NUEVA ASIGNACIÓN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cod_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(cod_aula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(cod_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(cod_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13)
                                .addComponent(cod_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel9)
                                .addGap(14, 14, 14)
                                .addComponent(car_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(35, 35, 35)
                                        .addComponent(jButton2)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(16, 16, 16)
                                        .addComponent(cod_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel10)
                                        .addGap(39, 39, 39)
                                        .addComponent(nota_asig, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Label_status)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cod_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cod_aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cod_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cod_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cod_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cod_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(nota_asig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(car_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(Label_status)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/siu", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into asignacioncursosalumnos values(?,?,?,?,?,?,?,?)");
            /*-----------------------------------------------------------------------------------------------------------------------*/
            pst.setString(1, cod_carrera.getText().trim());
            pst.setString(2, cod_sede.getText().trim());
            pst.setString(3, cod_jornada.getText().trim());
            pst.setString(4, cod_seccion.getText().trim());
            pst.setString(5, cod_aula.getText().trim());
            pst.setString(6, cod_curso.getText().trim());
            pst.setString(7, car_alumno.getText().trim());
            pst.setString(8, nota_asig.getText().trim());
            pst.executeUpdate();
            //Borra lo que hay en campos
            cod_carrera.setText("");
            cod_sede.setText("");
            cod_jornada.setText("");
            cod_seccion.setText("");
            cod_aula.setText("");
            cod_curso.setText("");
            car_alumno.setText("");
            nota_asig.setText("");
            Label_status.setText("Asignación registrada con éxito!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite consultar las asignaciones en la base de datos
        try{

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/siu", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from asignacioncursosalumnos where ID = ?");

            /*-----------------------------------------------------------------------------------------------------------------------*/

            pst.setString(1, car_alumno.getText().trim());//busca lo que hay en el txt en la base de datos

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                //Busca lo que está en las " " y lo trae a los txt correspondientes
                cod_carrera.setText(rs.getString("codigo_carrera"));
                cod_sede.setText(rs.getString("codigo_sede"));
                cod_jornada.setText(rs.getString("codigo_jornada"));
                cod_seccion.setText(rs.getString("codigo_seccion"));
                cod_aula.setText(rs.getString("codigo_aula"));
                cod_curso.setText(rs.getString("codigo_curso"));
                nota_asig.setText(rs.getString("nota_asignacioncursoalumnos"));
            } else {
                JOptionPane.showMessageDialog(null, "***Asiganación no registrada***");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Permite borrar todos los campos del diseño para realizar un nuevo ingreso
        cod_carrera.setText("");
        cod_sede.setText("");
        cod_jornada.setText("");
        cod_seccion.setText("");
        cod_aula.setText("");
        cod_curso.setText("");
        car_alumno.setText("");
        nota_asig.setText("");
        Label_status.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_status;
    private javax.swing.JTextField car_alumno;
    private javax.swing.JTextField cod_aula;
    private javax.swing.JTextField cod_carrera;
    private javax.swing.JTextField cod_curso;
    private javax.swing.JTextField cod_jornada;
    private javax.swing.JTextField cod_seccion;
    private javax.swing.JTextField cod_sede;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nota_asig;
    // End of variables declaration//GEN-END:variables
}
