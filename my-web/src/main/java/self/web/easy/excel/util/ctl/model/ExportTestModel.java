package self.web.easy.excel.util.ctl.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExportTestModel extends BaseRowModel {
    private Integer id ;
    @ExcelProperty(index = 0 ,value = "标题")
    private String title;
    @ExcelProperty(index = 1 ,value = "描述")
    private BigDecimal desc;

    public ExportTestModel(Integer id) {
        this.id = id;
        this.title = "标题"+id;
        this.desc = new BigDecimal(id);
    }

    /**
     * 无参构造函数是导入的必要条件
     */
    public ExportTestModel() {}
}
