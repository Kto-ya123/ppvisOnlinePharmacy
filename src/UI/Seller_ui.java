package UI;

import Interfaces.Account;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;

public class Seller_ui implements Account {
    private Display display;
    public Seller_ui(){
        display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Продавец");
        shell.setSize(350, 300);
        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 10;
        rowLayout.spacing = 40;
        shell.setLayout(rowLayout);

        Composite composite;
        Button buttonSetCost;
        Button delProduct;
        Button delCustomer;
        Button addCustomer;
        Button addProduct;
        Button sumProduct;


        composite = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutComposite = new RowLayout(SWT.VERTICAL);
        rowLayoutComposite.spacing = 10;
        composite.setLayout(rowLayoutComposite);

        buttonSetCost = new Button(composite, SWT.PUSH);
        RowData layoutDataButtonInput = new RowData();
        layoutDataButtonInput.width = 200;
        layoutDataButtonInput.height = 30;
        buttonSetCost.setLayoutData(layoutDataButtonInput);
        buttonSetCost.setText("Установить цену");

        delProduct = new Button(composite, SWT.PUSH);
        delProduct.setLayoutData(layoutDataButtonInput);
        delProduct.setText("Удалить товар");

        delCustomer = new Button(composite, SWT.PUSH);
        delCustomer.setLayoutData(layoutDataButtonInput);
        delCustomer.setText("Удалить покупателя");

        addProduct = new Button(composite, SWT.PUSH);
        addProduct.setLayoutData(layoutDataButtonInput);
        addProduct.setText("Добавить товар");

        sumProduct = new Button(composite, SWT.PUSH);
        sumProduct.setLayoutData(layoutDataButtonInput);
        sumProduct.setText("Подсчёт Товара");




        buttonSetCost.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                setCostByProductHandler();
            }
        });

        delProduct.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                deleteProductsHandler();
            }
        });

        delCustomer.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                deleteCustomer();
            }
        });

        addProduct.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                addProductsHandler();
            }
        });
        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

    @Override
    public void switchMode() {

    }
    @Override
    public void createInterface() {

    }

    void deleteProductsHandler(){
        Shell shell = new Shell(display);
        //setComponentsMainShell(shell);
        shell.setText("Удалить товар");
        shell.setSize(350, 300);
        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 10;
        rowLayout.spacing = 40;
        shell.setLayout(rowLayout);

        Composite composite;
        Text textInput;
        Button buttonInput;
        Combo textOutput;



        composite = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutComposite = new RowLayout(SWT.VERTICAL);
        rowLayoutComposite.spacing = 10;
        composite.setLayout(rowLayoutComposite);

        textOutput = new Combo(composite, SWT.MULTI
                | SWT.READ_ONLY | SWT.BORDER);
        RowData layoutDataTextOutput = new RowData();
        layoutDataTextOutput.width = 180;
        textOutput.setLayoutData(layoutDataTextOutput);
        textOutput.setText("Text");

        buttonInput = new Button(composite, SWT.PUSH);
        RowData layoutDataButtonInput = new RowData();
        layoutDataButtonInput.width = 220;
        layoutDataButtonInput.height = 30;
        buttonInput.setLayoutData(layoutDataButtonInput);
        buttonInput.setText("Удалить");

        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
    void addProductsHandler(){
        Shell shell = new Shell(display);
        //setComponentsMainShell(shell);
        shell.setText("Удалить товар");
        shell.setSize(350, 300);
        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 10;
        rowLayout.spacing = 40;
        shell.setLayout(rowLayout);

        Composite composite;
        Button buttonInput;
        Text nameInput;
        Text input;
        Text descriptionInput;
        Text costInput;

        composite = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutComposite = new RowLayout(SWT.VERTICAL);
        rowLayoutComposite.spacing = 10;
        composite.setLayout(rowLayoutComposite);



        nameInput = new Text(composite, SWT.BORDER);
        RowData layoutDataTextInput = new RowData();
        layoutDataTextInput.width = 200;
        nameInput.setLayoutData(layoutDataTextInput);

        input = new Text(composite, SWT.BORDER);
        input.setLayoutData(layoutDataTextInput);

        descriptionInput = new Text(composite, SWT.BORDER);
        descriptionInput.setLayoutData(layoutDataTextInput);

        costInput = new Text(composite, SWT.BORDER);
        costInput.setLayoutData(layoutDataTextInput);

        buttonInput = new Button(composite, SWT.PUSH);
        RowData layoutDataButtonInput = new RowData();
        layoutDataButtonInput.width = 220;
        layoutDataButtonInput.height = 30;
        buttonInput.setLayoutData(layoutDataButtonInput);
        buttonInput.setText("Добавить");


        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
    void setParametresHandler(){

    }
    void quantityProductsPharmacyHandler(){

    }

    void deleteCustomer(){
        Shell shell = new Shell(display);
        //setComponentsMainShell(shell);
        shell.setText("Удалить покупателя");
        shell.setSize(350, 300);
        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 10;
        rowLayout.spacing = 40;
        shell.setLayout(rowLayout);

        Composite composite;
        Text textInput;
        Button buttonInput;
        Combo textOutput;



        composite = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutComposite = new RowLayout(SWT.VERTICAL);
        rowLayoutComposite.spacing = 10;
        composite.setLayout(rowLayoutComposite);

        textOutput = new Combo(composite, SWT.MULTI
                | SWT.READ_ONLY | SWT.BORDER);
        RowData layoutDataTextOutput = new RowData();
        layoutDataTextOutput.width = 180;
        textOutput.setLayoutData(layoutDataTextOutput);
        textOutput.setText("Text");

        buttonInput = new Button(composite, SWT.PUSH);
        RowData layoutDataButtonInput = new RowData();
        layoutDataButtonInput.width = 220;
        layoutDataButtonInput.height = 30;
        buttonInput.setLayoutData(layoutDataButtonInput);
        buttonInput.setText("Удалить");

        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
    void setCostByProductHandler(){
        Shell shell = new Shell(display);
        //setComponentsMainShell(shell);
        shell.setText("Установить цену");
        shell.setSize(350, 300);
        RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 10;
        rowLayout.spacing = 40;
        shell.setLayout(rowLayout);

        Composite composite;
        Text textInput;
        Button buttonInput;
        Combo textOutput;



        composite = new Composite(shell, SWT.NULL);
        RowLayout rowLayoutComposite = new RowLayout(SWT.VERTICAL);
        rowLayoutComposite.spacing = 10;
        composite.setLayout(rowLayoutComposite);

        textOutput = new Combo(composite, SWT.MULTI
                | SWT.READ_ONLY | SWT.BORDER);
        RowData layoutDataTextOutput = new RowData();
        layoutDataTextOutput.width = 180;
        textOutput.setLayoutData(layoutDataTextOutput);
        textOutput.setText("Text");

        textInput = new Text(composite, SWT.BORDER);
        RowData layoutDataTextInput = new RowData();
        layoutDataTextInput.width = 200;
        textInput.setLayoutData(layoutDataTextInput);

        buttonInput = new Button(composite, SWT.PUSH);
        RowData layoutDataButtonInput = new RowData();
        layoutDataButtonInput.width = 220;
        layoutDataButtonInput.height = 30;
        buttonInput.setLayoutData(layoutDataButtonInput);
        buttonInput.setText("Установить");

        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }

    }
}
