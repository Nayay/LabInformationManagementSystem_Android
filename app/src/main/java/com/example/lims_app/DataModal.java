package com.example.lims_app;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModal {

@SerializedName("batchid")
@Expose
private String batchid;
@SerializedName("receivedby")
@Expose
private String receivedby;
@SerializedName("site")
@Expose
private String site;
@SerializedName("batchname")
@Expose
private String batchname;
@SerializedName("cocnumber")
@Expose
private String cocnumber;
@SerializedName("client")
@Expose
private String client;
@SerializedName("datetimereceived")
@Expose
private String datetimereceived;
@SerializedName("ponumber")
@Expose
private String ponumber;
@SerializedName("project")
@Expose
private String project;
@SerializedName("quote")
@Expose
private String quote;
@SerializedName("submittedby")
@Expose
private String submittedby;
@SerializedName("invoiceto")
@Expose
private String invoiceto;
@SerializedName("sampletype")
@Expose
private String sampletype;
@SerializedName("prepcode")
@Expose
private String prepcode;
@SerializedName("noofsamples")
@Expose
private String noofsamples;
@SerializedName("containers")
@Expose
private String containers;
@SerializedName("status")
@Expose
private String status;
@SerializedName("specialinstructions")
@Expose
private String specialinstructions;
@SerializedName("reportto")
@Expose
private String reportto;
@SerializedName("selectednames")
@Expose
private String selectednames;
@SerializedName("addpackage")
@Expose
private String addpackage;
@SerializedName("selectedpackages")
@Expose
private String selectedpackages;
@SerializedName("addflag")
@Expose
private String addflag;
@SerializedName("selectedflags")
@Expose
private String selectedflags;
@SerializedName("duedate")
@Expose
private String duedate;
@SerializedName("shipper")
@Expose
private String shipper;
@SerializedName("shipperreference")
@Expose
private String shipperreference;

public String getBatchid() {
return batchid;
}

public void setBatchid(String batchid) {
this.batchid = batchid;
}

public String getReceivedby() {
return receivedby;
}

public void setReceivedby(String receivedby) {
this.receivedby = receivedby;
}

public String getSite() {
return site;
}

public void setSite(String site) {
this.site = site;
}

public String getBatchname() {
return batchname;
}

public void setBatchname(String batchname) {
this.batchname = batchname;
}

public String getCocnumber() {
return cocnumber;
}

public void setCocnumber(String cocnumber) {
this.cocnumber = cocnumber;
}

public String getClient() {
return client;
}

public void setClient(String client) {
this.client = client;
}

public String getDatetimereceived() {
return datetimereceived;
}

public void setDatetimereceived(String datetimereceived) {
this.datetimereceived = datetimereceived;
}

public String getPonumber() {
return ponumber;
}

public void setPonumber(String ponumber) {
this.ponumber = ponumber;
}

public String getProject() {
return project;
}

public void setProject(String project) {
this.project = project;
}

public String getQuote() {
return quote;
}

public void setQuote(String quote) {
this.quote = quote;
}

public String getSubmittedby() {
return submittedby;
}

public void setSubmittedby(String submittedby) {
this.submittedby = submittedby;
}

public String getInvoiceto() {
return invoiceto;
}

public void setInvoiceto(String invoiceto) {
this.invoiceto = invoiceto;
}

public String getSampletype() {
return sampletype;
}

public void setSampletype(String sampletype) {
this.sampletype = sampletype;
}

public String getPrepcode() {
return prepcode;
}

public void setPrepcode(String prepcode) {
this.prepcode = prepcode;
}

public String getNoofsamples() {
return noofsamples;
}

public void setNoofsamples(String noofsamples) {
this.noofsamples = noofsamples;
}

public String getContainers() {
return containers;
}

public void setContainers(String containers) {
this.containers = containers;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getSpecialinstructions() {
return specialinstructions;
}

public void setSpecialinstructions(String specialinstructions) {
this.specialinstructions = specialinstructions;
}

public String getReportto() {
return reportto;
}

public void setReportto(String reportto) {
this.reportto = reportto;
}

public String getSelectednames() {
return selectednames;
}

public void setSelectednames(String selectednames) {
this.selectednames = selectednames;
}

public String getAddpackage() {
return addpackage;
}

public void setAddpackage(String addpackage) {
this.addpackage = addpackage;
}

public String getSelectedpackages() {
return selectedpackages;
}

public void setSelectedpackages(String selectedpackages) {
this.selectedpackages = selectedpackages;
}

public String getAddflag() {
return addflag;
}

public void setAddflag(String addflag) {
this.addflag = addflag;
}

public String getSelectedflags() {
return selectedflags;
}

public void setSelectedflags(String selectedflags) {
this.selectedflags = selectedflags;
}

public String getDuedate() {
return duedate;
}

public void setDuedate(String duedate) {
this.duedate = duedate;
}

public String getShipper() {
return shipper;
}

public void setShipper(String shipper) {
this.shipper = shipper;
}

public String getShipperreference() {
return shipperreference;
}

public void setShipperreference(String shipperreference) {
this.shipperreference = shipperreference;
}

}