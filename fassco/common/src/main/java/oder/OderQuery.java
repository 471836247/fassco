package oder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "响应返回数据对象")
public class OderQuery implements Serializable {

    @ApiModelProperty(value = "id用户名",required=true)
    private String id;
    @ApiModelProperty(value = "dddd用户名",required=true)
    private String dddd;
}
