import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public final class IconCellRendered extends DefaultTableCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static ImageIcon OUI_IMAGE = new ImageIcon("icons\\libre.png");
	private final static ImageIcon NON_IMAGE = new ImageIcon("icons\\occ.png");

	@Override
	public Component getTableCellRendererComponent(JTable table,
			Object value, boolean isSelected, boolean hasFocus, int row,
			int column) {

		Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		JLabel label = (JLabel)component;
		label.setHorizontalAlignment(SwingConstants.CENTER);
		if ( "Libre".equals(value) ) {
			label.setIcon(OUI_IMAGE);
		}
		else if ( "Occupée".equals(value) ) {
			label.setIcon(NON_IMAGE);
		}
	

		return component;
	}


}