package edu.monash.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.DataProcesseddataBean;
import org.nrg.xdat.bean.DataPreprocesseddataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "DataPlugin",
        name = "Plugin for TRACKFA data type",
        dataModels = {@XnatDataModel(value = DataProcesseddataBean.SCHEMA_ELEMENT_NAME,
                                    singular = "Processed Data",
                                    code = "MR_PROC"),
                        @XnatDataModel(value = DataPreprocesseddataBean.SCHEMA_ELEMENT_NAME,
                        singular = " Pre Processed Data",
        code = "MR_PREPROC")}

)

public class DataPlugin {
    @Bean
    public String DataPluginMessage(){
        return "hello from TRACKFA plugin";
    }
}
