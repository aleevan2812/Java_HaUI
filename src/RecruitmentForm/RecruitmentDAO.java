package RecruitmentForm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author caotrungduc
 */
public class RecruitmentDAO extends AbstractTableModel {
    public String Name[] = {"Title", "Position", "Age", "Gender", "Quantity", "Deadline", "Degree", "Experience"};
    public Class classes[] = {String.class, String.class, Integer.class, String.class, Integer.class, String.class, String.class, String.class, String.class};
    ArrayList<RecruitmentDTO> listRecruit = new ArrayList<>();

    public RecruitmentDAO(ArrayList<RecruitmentDTO> list) {
        listRecruit = list;
    }
    
    @Override
    public Class getColumnClass(int ColumnIndex){
        return classes[ColumnIndex];
    }
    
    @Override
    public String getColumnName(int Column){
        return Name[Column];
    }
    
    @Override
    public int getRowCount() {
        return listRecruit.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return listRecruit.get(rowIndex).getTitle();
            case 1: return listRecruit.get(rowIndex).getPosition();
            case 2: return listRecruit.get(rowIndex).getAge();
            case 3: return listRecruit.get(rowIndex).getGender();
            case 4: return listRecruit.get(rowIndex).getQuantity();
            case 5: return listRecruit.get(rowIndex).getDeadline();
            case 6: return listRecruit.get(rowIndex).getDegree();
            case 7: return listRecruit.get(rowIndex).getExperience();
            default: return null;
        }
    }
}
