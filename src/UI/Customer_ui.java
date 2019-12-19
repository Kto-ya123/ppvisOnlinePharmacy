package UI;

import Interfaces.Account;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;

public class Customer_ui implements Account {
    private Display display;
    public Customer_ui(){
        display = new Display();
        putInBasketHanlder();
    }
    @Override
    public void createInterface() {

    }

    @Override
    public void switchMode() {

    }
    void viewCatalogOfProductsHandler(){

    }
    void viewBasketHandler(){
        Shell shell = new Shell(display);
        //setComponentsMainShell(shell);
        shell.setText("Оформить заказ");
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
        buttonInput.setText("Оформить заказ");

        buttonInput.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                shell.close();
            }
        });

        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
    void putInBasketHanlder(){
        Shell shell = new Shell(display);
        //setComponentsMainShell(shell);
        shell.setText("Добавить Товар");
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
        buttonInput.setText("Добавить в корзину");

        buttonInput.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                viewBasketHandler();
            }
        });

        shell.open();

        while (!shell.isDisposed()) {
            if (display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
    void deleteFromBasketHandler(){

    }
    void checkoutHandler(){

    }
    void trackOrderHandler(){

    }

}
