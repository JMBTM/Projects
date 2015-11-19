import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;


public class Calc {

	protected Shell shell;
	private Text txtA;
	private Text txtB;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calc window = new Calc();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		final Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(10, 190, 49, 34);
		lblAnswer.setText("Answer:");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				int num1 = Integer.parseInt(txtA.getText());
				int num2 = Integer.parseInt(txtB.getText());
				int ans = num1 + num2;
				lblAnswer.setText("Answer: " + ans);
			}
		});
		btnNewButton.setBounds(5, 226, 75, 25);
		btnNewButton.setText("Submit");
		
		txtA = new Text(shell, SWT.BORDER);
		txtA.setText("a");
		txtA.setBounds(35, 73, 76, 21);
		
		txtB = new Text(shell, SWT.BORDER);
		txtB.setText("b");
		txtB.setBounds(35, 131, 76, 21);
		
		Label lblFirstNumber = new Label(shell, SWT.NONE);
		lblFirstNumber.setBounds(35, 52, 76, 15);
		lblFirstNumber.setText("First Number:");
		
		Label lblSecondNumber = new Label(shell, SWT.NONE);
		lblSecondNumber.setBounds(35, 110, 102, 15);
		lblSecondNumber.setText("First Number:");
		
		
		
	}
}
