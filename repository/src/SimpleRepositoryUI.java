
public class SimpleRepositoryUI extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;

    private final Repository repository;

    public SimpleRepositoryUI(Repository repository) {
        this.repository = repository;
        initComponents();
        refreshModel();
    }

    public void display() {
        setVisible(true);
    }

    private void refreshInputs() {
        jTextField1.setText("");
        jList1.setSelectedIndex(-1);
    }

    private void refreshButtons() {
        jButton4.setEnabled(!jTextField1.getText().isEmpty());
        jButton3.setEnabled(jList1.getSelectedIndex() > -1 && !jTextField1.getText().isEmpty());
        jButton2.setEnabled(!jTextField1.getText().isEmpty());
        jButton1.setEnabled(jList1.getSelectedIndex() > -1);
    }

    private void refreshModel() {
        javax.swing.DefaultListModel<String> model = new javax.swing.DefaultListModel<>();
        for (String element : repository.getAll()) {
            model.addElement(element);
        }
        jList1.setModel(model);
    }

    private void refreshAll() {
        refreshInputs();
        refreshButtons();
        refreshModel();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prosta baza danych");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        jButton1.setText("Usuń zaznaczenie");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Usuń tekst");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aktualizuj");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Dodaj");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addContainerGap())
        );

        pack();
    }

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {
        refreshButtons();
    }

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {
        refreshButtons();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        repository.add(jTextField1.getText());
        refreshAll();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        repository.update(jList1.getSelectedIndex(), jTextField1.getText());
        refreshAll();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        repository.remove(jTextField1.getText());
        refreshAll();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        repository.remove(jList1.getSelectedIndex());
        refreshAll();
    }

}
