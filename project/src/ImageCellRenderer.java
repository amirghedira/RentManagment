import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public final class ImageCellRenderer extends DefaultTableCellRenderer {
 
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
 
			Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
 
			JLabel label = (JLabel)component;
			label.setHorizontalAlignment(SwingConstants.CENTER);
			ImageIcon icon =(ImageIcon) value;
 
			if ( icon.getImageLoadStatus()==java.awt.MediaTracker.COMPLETE ) {
				label.setIcon(icon);
				table.setRowHeight(row, icon.getIconHeight());
				table.getColumnModel().getColumn(column).setPreferredWidth(icon.getIconWidth());
			}
			else {
				label.setIcon(null);
				table.setRowHeight(row, table.getRowHeight());
			}
			label.setText(""); // on efface le texte
 
 
			return component;
		}
 
 
	}