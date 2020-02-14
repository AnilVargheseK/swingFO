
package com.bean.notis1;

import com.bean.notis1.Data;

public class TradeInquiry {

    private String version;
    Data DataObject;

 // Getter Methods 
    public String getVersion() {
        return version;
    }
    public Data getData() {
        return DataObject;
    }

 // Setter Methods 
    public void setVersion(String version) {
        this.version = version;
    }
    public void setData(Data dataObject) {
        this.DataObject = dataObject;
    }
}
