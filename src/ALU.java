/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.util.Arrays;
import javax.swing.text.*;
/**
 *
 * @author Chawp
 */
public class ALU extends javax.swing.JFrame {
    private String[] mux1 = new String[3];
    private String[] mux2 = new String[10];
    private String mux1out = "";
    private String mux2out = "";
    private int step = 0;
    /**
     * Creates new form ALU
     */
    public ALU() {
        initComponents();
        // <editor-fold defaultstate="collapsed" desc="Initialization stuff">  
        this.setSize(1140,1040);
        this.setTitle("Dylan's Godlike ALU");
        hideLabels();
        ((javax.swing.text.AbstractDocument) input.getDocument()).setDocumentFilter(new MyDocumentFilter());
        // </editor-fold>
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        operation = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextPane();
        resetSet = new javax.swing.JCheckBox();
        addSet = new javax.swing.JCheckBox();
        multSet = new javax.swing.JCheckBox();
        andSet = new javax.swing.JCheckBox();
        subSet = new javax.swing.JCheckBox();
        orSet = new javax.swing.JCheckBox();
        xorSet = new javax.swing.JCheckBox();
        notSet = new javax.swing.JCheckBox();
        loadSet = new javax.swing.JCheckBox();
        reset2Set = new javax.swing.JCheckBox();
        onSet = new javax.swing.JCheckBox();
        offSet = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextPane();
        inputLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        addLabel = new javax.swing.JLabel();
        subLabel = new javax.swing.JLabel();
        onLabel = new javax.swing.JLabel();
        andLabel = new javax.swing.JLabel();
        orLabel = new javax.swing.JLabel();
        xorLabel = new javax.swing.JLabel();
        notLabel = new javax.swing.JLabel();
        loadLabel = new javax.swing.JLabel();
        nothingLabel = new javax.swing.JLabel();
        multLabel = new javax.swing.JLabel();
        resetLabel = new javax.swing.JLabel();
        offLabel = new javax.swing.JLabel();
        clockLabel2 = new javax.swing.JLabel();
        clockLabel = new javax.swing.JLabel();
        FF1Label = new javax.swing.JLabel();
        FF1output = new javax.swing.JTextField();
        FF2Label = new javax.swing.JLabel();
        FF2Output = new javax.swing.JTextField();
        addOutLabel = new javax.swing.JLabel();
        resetOutLabel = new javax.swing.JLabel();
        subOutLabel = new javax.swing.JLabel();
        andOutLabel = new javax.swing.JLabel();
        orOutLabel = new javax.swing.JLabel();
        xorOutLabel = new javax.swing.JLabel();
        notOutLabel = new javax.swing.JLabel();
        loadOutLabel = new javax.swing.JLabel();
        nothingOutLabel = new javax.swing.JLabel();
        multOutLabel = new javax.swing.JLabel();
        mux1OutLabel = new javax.swing.JLabel();
        mux2OutLabel = new javax.swing.JLabel();
        waifuLabel = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        input.setAutoscrolls(false);
        jScrollPane1.setViewportView(input);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 130, 30);

        resetSet.setText("RST");
        resetSet.setToolTipText("");
        resetSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSetActionPerformed(evt);
            }
        });
        getContentPane().add(resetSet);
        resetSet.setBounds(360, 500, 60, 23);

        addSet.setText("ADD");
        addSet.setToolTipText("");
        getContentPane().add(addSet);
        addSet.setBounds(360, 540, 47, 23);

        multSet.setText("MULT");
        multSet.setToolTipText("");
        getContentPane().add(multSet);
        multSet.setBounds(360, 520, 60, 23);

        andSet.setText("AND");
        andSet.setToolTipText("");
        getContentPane().add(andSet);
        andSet.setBounds(360, 580, 47, 23);

        subSet.setText("SUB");
        subSet.setToolTipText("");
        getContentPane().add(subSet);
        subSet.setBounds(360, 560, 50, 23);

        orSet.setText("OR");
        orSet.setToolTipText("");
        getContentPane().add(orSet);
        orSet.setBounds(360, 600, 41, 23);

        xorSet.setText("XOR");
        xorSet.setToolTipText("");
        getContentPane().add(xorSet);
        xorSet.setBounds(360, 620, 47, 23);

        notSet.setText("NOT");
        notSet.setToolTipText("");
        getContentPane().add(notSet);
        notSet.setBounds(360, 640, 47, 23);

        loadSet.setText("LOAD");
        loadSet.setToolTipText("");
        getContentPane().add(loadSet);
        loadSet.setBounds(360, 660, 60, 23);

        reset2Set.setText("RST");
        reset2Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2SetActionPerformed(evt);
            }
        });
        getContentPane().add(reset2Set);
        reset2Set.setBounds(90, 920, 60, 23);

        onSet.setText("ON");
        getContentPane().add(onSet);
        onSet.setBounds(90, 940, 60, 23);

        offSet.setText("OFF");
        getContentPane().add(offSet);
        offSet.setBounds(90, 960, 45, 23);

        output.setEditable(false);
        output.setAutoscrolls(false);
        jScrollPane2.setViewportView(output);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(930, 300, 137, 33);

        inputLabel.setText("Input");
        getContentPane().add(inputLabel);
        inputLabel.setBounds(30, 160, 40, 14);

        outputLabel.setText("Output");
        getContentPane().add(outputLabel);
        outputLabel.setBounds(940, 280, 40, 14);

        goButton.setText("step");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        getContentPane().add(goButton);
        goButton.setBounds(40, 230, 90, 23);

        addLabel.setText("ADD");
        getContentPane().add(addLabel);
        addLabel.setBounds(270, 150, 70, 20);

        subLabel.setText("SUB");
        getContentPane().add(subLabel);
        subLabel.setBounds(270, 190, 70, 20);

        onLabel.setText("1");
        getContentPane().add(onLabel);
        onLabel.setBounds(80, 770, 30, 30);

        andLabel.setText("AND");
        getContentPane().add(andLabel);
        andLabel.setBounds(270, 220, 70, 30);

        orLabel.setText("OR");
        getContentPane().add(orLabel);
        orLabel.setBounds(270, 260, 70, 20);

        xorLabel.setText("XOR");
        getContentPane().add(xorLabel);
        xorLabel.setBounds(270, 300, 70, 20);

        notLabel.setText("NOT");
        getContentPane().add(notLabel);
        notLabel.setBounds(270, 330, 70, 30);

        loadLabel.setText("LOAD");
        getContentPane().add(loadLabel);
        loadLabel.setBounds(270, 370, 70, 20);

        nothingLabel.setText("Do Nothing");
        getContentPane().add(nothingLabel);
        nothingLabel.setBounds(250, 400, 90, 40);

        multLabel.setText("MULT");
        getContentPane().add(multLabel);
        multLabel.setBounds(270, 110, 70, 30);

        resetLabel.setText("RESET");
        getContentPane().add(resetLabel);
        resetLabel.setBounds(260, 80, 70, 20);

        offLabel.setText("0");
        getContentPane().add(offLabel);
        offLabel.setBounds(80, 840, 30, 20);

        clockLabel2.setText("Clock");
        getContentPane().add(clockLabel2);
        clockLabel2.setBounds(300, 910, 34, 14);

        clockLabel.setText("Clock");
        getContentPane().add(clockLabel);
        clockLabel.setBounds(650, 300, 34, 14);

        FF1Label.setText("FF1");
        getContentPane().add(FF1Label);
        FF1Label.setBounds(300, 760, 30, 20);

        FF1output.setEditable(false);
        FF1output.setText("X");
        getContentPane().add(FF1output);
        FF1output.setBounds(270, 800, 80, 20);

        FF2Label.setText("FF2");
        getContentPane().add(FF2Label);
        FF2Label.setBounds(650, 150, 34, 14);

        FF2Output.setEditable(false);
        FF2Output.setText("XXXXXXXX");
        getContentPane().add(FF2Output);
        FF2Output.setBounds(620, 180, 80, 30);

        addOutLabel.setText("00000000");
        getContentPane().add(addOutLabel);
        addOutLabel.setBounds(360, 140, 60, 14);

        resetOutLabel.setText("00000000");
        getContentPane().add(resetOutLabel);
        resetOutLabel.setBounds(360, 70, 60, 14);

        subOutLabel.setText("00000000");
        getContentPane().add(subOutLabel);
        subOutLabel.setBounds(360, 180, 60, 14);

        andOutLabel.setText("00000000");
        getContentPane().add(andOutLabel);
        andOutLabel.setBounds(360, 210, 60, 14);

        orOutLabel.setText("00000000");
        getContentPane().add(orOutLabel);
        orOutLabel.setBounds(360, 250, 60, 14);

        xorOutLabel.setText("00000000");
        getContentPane().add(xorOutLabel);
        xorOutLabel.setBounds(360, 290, 60, 14);

        notOutLabel.setText("00000000");
        getContentPane().add(notOutLabel);
        notOutLabel.setBounds(360, 320, 60, 14);

        loadOutLabel.setText("00000000");
        getContentPane().add(loadOutLabel);
        loadOutLabel.setBounds(360, 360, 60, 14);

        nothingOutLabel.setText("00000000");
        getContentPane().add(nothingOutLabel);
        nothingOutLabel.setBounds(360, 400, 60, 14);

        multOutLabel.setText("00000000");
        getContentPane().add(multOutLabel);
        multOutLabel.setBounds(360, 100, 60, 14);

        mux1OutLabel.setText("0");
        getContentPane().add(mux1OutLabel);
        mux1OutLabel.setBounds(210, 790, 40, 14);

        mux2OutLabel.setText("00000000");
        getContentPane().add(mux2OutLabel);
        mux2OutLabel.setBounds(530, 180, 60, 14);

        waifuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kuroyukihime.png"))); // NOI18N
        getContentPane().add(waifuLabel);
        waifuLabel.setBounds(700, 500, 320, 390);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ALU.png"))); // NOI18N
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 1145, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSetActionPerformed
        //reset is the same input wire, so if one is set the other is too
        if(resetSet.isSelected())
            reset2Set.setSelected(true);
        else if(!resetSet.isSelected())
            reset2Set.setSelected(false);
    }//GEN-LAST:event_resetSetActionPerformed

    private void reset2SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2SetActionPerformed
        //reset is the same input wire, so if one is set the other is too
        if(reset2Set.isSelected())
            resetSet.setSelected(true);
        else if(!reset2Set.isSelected())
            resetSet.setSelected(false);
    }//GEN-LAST:event_reset2SetActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        //formats input value and sets to 0 if empty
        int in;
        in = input.getText().length() == 0? 0 : Integer.parseInt(input.getText(),2);
        input.setText(format(in));
        
        //Order of things to do: feed values from flip flops into muxs, calculate mux values, select proper mux values, store in flip flop, output vals from mux
        if(step == 0)
        {
            step++;
            setMux1Values(FF1output.getText());
            setMux2Values(FF2Output.getText(), input.getText());
        }
        else if(step == 1)
        {
            step++;
            mux1select();
            mux2select();
        }
        else if(step == 2)
        {
            step++;
            recolorMux1();
            FF1output.setText(mux1out);
            FF2Output.setText(mux2out);
            output.setText(mux2out);
        }
        else if (step == 3)
        {
            step = 0;
            hideLabels();
        }
    }//GEN-LAST:event_goButtonActionPerformed
    //calculates all the values to be output from mux1
    private void setMux1Values(String FF)
    {
        System.out.println("setting mux1 with a flip flop val of: " + FF);
        mux1[0] = FF;
        mux1[1] = "1";
        mux1[2] = "0";
        System.out.println(Arrays.toString(mux1));
    }
    //calculates all the values to be output from mux2
    private void setMux2Values(String FF, String Input)
    {
        
        System.out.printf("setting mux1 with vals of: %s : %s\n",FF,Input);
        //calculate values for each output
        multOutLabel.setText(mult(FF, Input));
        addOutLabel .setText(add (FF, Input));
        subOutLabel .setText(sub (FF, Input));
        andOutLabel .setText(and (FF, Input));
        orOutLabel  .setText(or  (FF, Input));
        xorOutLabel .setText(xor (FF, Input));
        notOutLabel .setText(not (FF));
        loadOutLabel.setText(load(    Input));
        
        nothingOutLabel.setText(FF);
        
        //assign values into mux
        mux2[0] = resetOutLabel   .getText();
        mux2[1] = multOutLabel    .getText();
        mux2[2] = addOutLabel     .getText();
        mux2[3] = subOutLabel     .getText();
        mux2[4] = andOutLabel     .getText();
        mux2[5] = orOutLabel      .getText();
        mux2[6] = xorOutLabel     .getText();
        mux2[7] = notOutLabel     .getText();
        mux2[8] = loadOutLabel    .getText();
        mux2[9] = nothingOutLabel .getText();
        showMux2Values();
        System.out.println(Arrays.toString(mux2));
    }
    //solves for the output of Mux 1
    private void mux1select()//, boolean rst, boolean mult, boolean add, boolean sub, boolean and, boolean or, boolean xor, boolean not, boolean load)
    {
        if(reset2Set.isSelected() || onSet.isSelected())
            mux1out = mux1[1];
        else if(offSet.isSelected())
            mux1out = mux1[2];
        else
            mux1out = mux1[0];
        System.out.println("mux1 output is: " + mux1out);
        mux1OutLabel.setText(mux1out);
        mux1OutLabel.setVisible(true);
    }
    //solves for the output of Mux 2
    private void mux2select()
    {
        if(resetSet.isSelected())
        {
            mux2out = mux2[0];
            resetOutLabel.setForeground(Color.red);
        }
        else{
            if(mux1out.equals("1"))
            {
                if(multSet.isSelected()){
                    mux2out = mux2[1];
                    multOutLabel.setForeground(Color.red);
                }
                else if(addSet.isSelected()){
                    mux2out = mux2[2];
                    addOutLabel.setForeground(Color.red);
                }
                else if(subSet.isSelected()){
                    mux2out = mux2[3];
                    subOutLabel.setForeground(Color.red);
                }
                else if(andSet.isSelected()){
                    mux2out = mux2[4];
                    andOutLabel.setForeground(Color.red);
                }
                else if(orSet.isSelected()){
                    mux2out = mux2[5];
                    orOutLabel.setForeground(Color.red);
                }
                else if(xorSet.isSelected()){
                    mux2out = mux2[6];
                    xorOutLabel.setForeground(Color.red);
                }
                else if(notSet.isSelected()){
                    mux2out = mux2[7];
                    notOutLabel.setForeground(Color.red);
                }
                else if(loadSet.isSelected()){
                    mux2out = mux2[8];
                    loadOutLabel.setForeground(Color.red);
                }
                else{
                    mux2out = mux2[9];
                    nothingOutLabel.setForeground(Color.red);
                }
            }
            else{
                mux2out = mux2[9];
                nothingOutLabel.setForeground(Color.red);
            }
        }
        System.out.println("mux2 output is: " + mux2out);
        mux2OutLabel.setText(mux2out);
        mux2OutLabel.setVisible(true);
    }
    
    private void showMux2Values()
    {
        resetOutLabel.setVisible(true);
        multOutLabel.setVisible(true);
        addOutLabel.setVisible(true);
        subOutLabel.setVisible(true);
        andOutLabel.setVisible(true);
        orOutLabel.setVisible(true);
        xorOutLabel.setVisible(true);
        notOutLabel.setVisible(true);
        loadOutLabel.setVisible(true);
        nothingOutLabel.setVisible(true);
    }
    //multiplies two binary values and formats the result
    private String mult(String FF, String Input)
    {
       if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int inval = Integer.parseInt(Input, 2);
        int product = ffval*inval;
        return format(product); 
    }
    
    //adds the two binary values together and formats the result
    private String add(String FF, String Input)
    {
        if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int inval = Integer.parseInt(Input, 2);
        int sum = ffval+inval;
        return format(sum);
    }
    //subtracts the two binary values from each other and formats the result
    private String sub(String FF, String Input)
    {
        if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int inval = Integer.parseInt(Input, 2);
        int sum = ffval-inval;
        return format(sum);
    }
    //ands the two binary values together and formats the result
    private String and(String FF, String Input)
    {
        if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int inval = Integer.parseInt(Input, 2);
        int and = ffval&inval;
        return format(and);
    }
    //ors the two binary values together and formats the result
    private String or(String FF, String Input)
    {
        if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int inval = Integer.parseInt(Input, 2);
        int or = ffval|inval;
        return format(or);
    }
    //xors the two binary values together and formats the result
    private String xor(String FF, String Input)
    {
        if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int inval = Integer.parseInt(Input, 2);
        int xor = ffval^inval;
        return format(xor);
    }
    //nots the binary value and formats the result
    private String not(String FF)
    {
        if(FF.equals("XXXXXXXX"))
            return "XXXXXXXX";
        int ffval = Integer.parseInt(FF, 2);
        int not = ~ffval;
        return format(not);
    }
    //loads the binary value and formats the result
    private String load(String Input)
    {
        if(Input.length() == 0)
            return "00000000";
        int inval = Integer.parseInt(Input, 2);
        return format(inval);
    }
    //formats a number into an 8bit binary number, truncated if it overflows
    private String format(int num)
    {
        //convert the number to a minimum of 8 characters in bits
        String output = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        //truncates number to last 8 bits
        output = output.substring(output.length()-8, output.length());
        return output;
    }
    //hides all labels that will be shown later
    private void hideLabels()
    {
        //mux1 input hides
        resetOutLabel.setVisible(false);
        multOutLabel.setVisible(false);
        addOutLabel.setVisible(false);
        subOutLabel.setVisible(false);
        andOutLabel.setVisible(false);
        orOutLabel.setVisible(false);
        xorOutLabel.setVisible(false);
        notOutLabel.setVisible(false);
        loadOutLabel.setVisible(false);
        nothingOutLabel.setVisible(false);
        
        //mux output hides
        mux1OutLabel.setVisible(false);
        mux2OutLabel.setVisible(false);
    }
    private void recolorMux1()
    {
        resetOutLabel.setForeground(Color.black);
        multOutLabel.setForeground(Color.black);
        addOutLabel.setForeground(Color.black);
        subOutLabel.setForeground(Color.black);
        andOutLabel.setForeground(Color.black);
        orOutLabel.setForeground(Color.black);
        xorOutLabel.setForeground(Color.black);
        notOutLabel.setForeground(Color.black);
        loadOutLabel.setForeground(Color.black);
        nothingOutLabel.setForeground(Color.black);
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ALU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALU().setVisible(true);
            }
        });
        
    }
    class MyDocumentFilter extends javax.swing.text.DocumentFilter
    {
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException 
        {
            System.out.println("replace: " + text);
            if(text.length() == 1)
            {
                if(text.charAt(0) == '1' || text.charAt(0) == '0')
                {
                    System.out.println("IN THE IF");
                    super.replace(fb, offset, length, text, attrs);
                }
                else{
                    System.out.println("IN THE ELLSE");
                    super.replace(fb, offset, length, "", attrs);
                }
            }
            else{
                boolean juan = true;
                for (int i = 0; i < text.length(); i++){
                    char c = text.charAt(i);
                    if(c != '0' && c != '1')
                    {
                        juan = false;
                        break;
                    }
                }
                if(juan){
                    System.out.println("JUAN");
                    super.replace(fb, offset, length, text, attrs);}
                else{
                    System.out.println("NO JUAN");
                    super.replace(fb, offset, length, "", attrs);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel FF1Label;
    private javax.swing.JTextField FF1output;
    private javax.swing.JLabel FF2Label;
    private javax.swing.JTextField FF2Output;
    private javax.swing.JLabel addLabel;
    private javax.swing.JLabel addOutLabel;
    private javax.swing.JCheckBox addSet;
    private javax.swing.JLabel andLabel;
    private javax.swing.JLabel andOutLabel;
    private javax.swing.JCheckBox andSet;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JLabel clockLabel2;
    private javax.swing.JButton goButton;
    private javax.swing.JTextPane input;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loadLabel;
    private javax.swing.JLabel loadOutLabel;
    private javax.swing.JCheckBox loadSet;
    private javax.swing.JLabel multLabel;
    private javax.swing.JLabel multOutLabel;
    private javax.swing.JCheckBox multSet;
    private javax.swing.JLabel mux1OutLabel;
    private javax.swing.JLabel mux2OutLabel;
    private javax.swing.JLabel notLabel;
    private javax.swing.JLabel notOutLabel;
    private javax.swing.JCheckBox notSet;
    private javax.swing.JLabel nothingLabel;
    private javax.swing.JLabel nothingOutLabel;
    private javax.swing.JLabel offLabel;
    private javax.swing.JCheckBox offSet;
    private javax.swing.JLabel onLabel;
    private javax.swing.JCheckBox onSet;
    private javax.swing.ButtonGroup operation;
    private javax.swing.JLabel orLabel;
    private javax.swing.JLabel orOutLabel;
    private javax.swing.JCheckBox orSet;
    private javax.swing.JTextPane output;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JCheckBox reset2Set;
    private javax.swing.JLabel resetLabel;
    private javax.swing.JLabel resetOutLabel;
    private javax.swing.JCheckBox resetSet;
    private javax.swing.JLabel subLabel;
    private javax.swing.JLabel subOutLabel;
    private javax.swing.JCheckBox subSet;
    private javax.swing.JLabel waifuLabel;
    private javax.swing.JLabel xorLabel;
    private javax.swing.JLabel xorOutLabel;
    private javax.swing.JCheckBox xorSet;
    // End of variables declaration//GEN-END:variables
    
}
