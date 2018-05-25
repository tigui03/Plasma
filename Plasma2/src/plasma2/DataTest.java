/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plasma2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author guillaume
 */
@Entity
@Table(name = "DataTest", catalog = "Tekna", schema = "")
@NamedQueries({
    @NamedQuery(name = "DataTest.findAll", query = "SELECT d FROM DataTest d")
    , @NamedQuery(name = "DataTest.findByTime", query = "SELECT d FROM DataTest d WHERE d.time = :time")
    , @NamedQuery(name = "DataTest.findByAit006N2", query = "SELECT d FROM DataTest d WHERE d.ait006N2 = :ait006N2")
    , @NamedQuery(name = "DataTest.findByGpt073", query = "SELECT d FROM DataTest d WHERE d.gpt073 = :gpt073")
    , @NamedQuery(name = "DataTest.findByCust002", query = "SELECT d FROM DataTest d WHERE d.cust002 = :cust002")
    , @NamedQuery(name = "DataTest.findByEncodeur", query = "SELECT d FROM DataTest d WHERE d.encodeur = :encodeur")
    , @NamedQuery(name = "DataTest.findByGmf001", query = "SELECT d FROM DataTest d WHERE d.gmf001 = :gmf001")
    , @NamedQuery(name = "DataTest.findByGmf005", query = "SELECT d FROM DataTest d WHERE d.gmf005 = :gmf005")
    , @NamedQuery(name = "DataTest.findByGmf008", query = "SELECT d FROM DataTest d WHERE d.gmf008 = :gmf008")
    , @NamedQuery(name = "DataTest.findByGmf009", query = "SELECT d FROM DataTest d WHERE d.gmf009 = :gmf009")
    , @NamedQuery(name = "DataTest.findByGmf010", query = "SELECT d FROM DataTest d WHERE d.gmf010 = :gmf010")
    , @NamedQuery(name = "DataTest.findByGmf011", query = "SELECT d FROM DataTest d WHERE d.gmf011 = :gmf011")
    , @NamedQuery(name = "DataTest.findByGmf013", query = "SELECT d FROM DataTest d WHERE d.gmf013 = :gmf013")
    , @NamedQuery(name = "DataTest.findByGmf020", query = "SELECT d FROM DataTest d WHERE d.gmf020 = :gmf020")
    , @NamedQuery(name = "DataTest.findByRampingstep", query = "SELECT d FROM DataTest d WHERE d.rampingstep = :rampingstep")
    , @NamedQuery(name = "DataTest.findByRampingCount", query = "SELECT d FROM DataTest d WHERE d.rampingCount = :rampingCount")
    , @NamedQuery(name = "DataTest.findByGpt001", query = "SELECT d FROM DataTest d WHERE d.gpt001 = :gpt001")
    , @NamedQuery(name = "DataTest.findByGpt003", query = "SELECT d FROM DataTest d WHERE d.gpt003 = :gpt003")
    , @NamedQuery(name = "DataTest.findByGpt005", query = "SELECT d FROM DataTest d WHERE d.gpt005 = :gpt005")
    , @NamedQuery(name = "DataTest.findByGpt006", query = "SELECT d FROM DataTest d WHERE d.gpt006 = :gpt006")
    , @NamedQuery(name = "DataTest.findByGpt008", query = "SELECT d FROM DataTest d WHERE d.gpt008 = :gpt008")
    , @NamedQuery(name = "DataTest.findByGpt009", query = "SELECT d FROM DataTest d WHERE d.gpt009 = :gpt009")
    , @NamedQuery(name = "DataTest.findByGpt010", query = "SELECT d FROM DataTest d WHERE d.gpt010 = :gpt010")
    , @NamedQuery(name = "DataTest.findByGpt014", query = "SELECT d FROM DataTest d WHERE d.gpt014 = :gpt014")
    , @NamedQuery(name = "DataTest.findByGpt015", query = "SELECT d FROM DataTest d WHERE d.gpt015 = :gpt015")
    , @NamedQuery(name = "DataTest.findByGpt016", query = "SELECT d FROM DataTest d WHERE d.gpt016 = :gpt016")
    , @NamedQuery(name = "DataTest.findByGpt018", query = "SELECT d FROM DataTest d WHERE d.gpt018 = :gpt018")
    , @NamedQuery(name = "DataTest.findByGpt027", query = "SELECT d FROM DataTest d WHERE d.gpt027 = :gpt027")
    , @NamedQuery(name = "DataTest.findByGpt032", query = "SELECT d FROM DataTest d WHERE d.gpt032 = :gpt032")
    , @NamedQuery(name = "DataTest.findByGpt036", query = "SELECT d FROM DataTest d WHERE d.gpt036 = :gpt036")
    , @NamedQuery(name = "DataTest.findByGpt037", query = "SELECT d FROM DataTest d WHERE d.gpt037 = :gpt037")
    , @NamedQuery(name = "DataTest.findByGpu003", query = "SELECT d FROM DataTest d WHERE d.gpu003 = :gpu003")
    , @NamedQuery(name = "DataTest.findByGtt002", query = "SELECT d FROM DataTest d WHERE d.gtt002 = :gtt002")
    , @NamedQuery(name = "DataTest.findByGtt004", query = "SELECT d FROM DataTest d WHERE d.gtt004 = :gtt004")
    , @NamedQuery(name = "DataTest.findByGtt005", query = "SELECT d FROM DataTest d WHERE d.gtt005 = :gtt005")
    , @NamedQuery(name = "DataTest.findByGve001", query = "SELECT d FROM DataTest d WHERE d.gve001 = :gve001")
    , @NamedQuery(name = "DataTest.findByWft001", query = "SELECT d FROM DataTest d WHERE d.wft001 = :wft001")
    , @NamedQuery(name = "DataTest.findByWft002", query = "SELECT d FROM DataTest d WHERE d.wft002 = :wft002")
    , @NamedQuery(name = "DataTest.findByWft003", query = "SELECT d FROM DataTest d WHERE d.wft003 = :wft003")
    , @NamedQuery(name = "DataTest.findByWft004", query = "SELECT d FROM DataTest d WHERE d.wft004 = :wft004")
    , @NamedQuery(name = "DataTest.findByWft022", query = "SELECT d FROM DataTest d WHERE d.wft022 = :wft022")
    , @NamedQuery(name = "DataTest.findByWpt001", query = "SELECT d FROM DataTest d WHERE d.wpt001 = :wpt001")
    , @NamedQuery(name = "DataTest.findByWtt001", query = "SELECT d FROM DataTest d WHERE d.wtt001 = :wtt001")
    , @NamedQuery(name = "DataTest.findByWtt002", query = "SELECT d FROM DataTest d WHERE d.wtt002 = :wtt002")
    , @NamedQuery(name = "DataTest.findByWtt003", query = "SELECT d FROM DataTest d WHERE d.wtt003 = :wtt003")
    , @NamedQuery(name = "DataTest.findByWtt004", query = "SELECT d FROM DataTest d WHERE d.wtt004 = :wtt004")
    , @NamedQuery(name = "DataTest.findByWtt006", query = "SELECT d FROM DataTest d WHERE d.wtt006 = :wtt006")
    , @NamedQuery(name = "DataTest.findByWtt007", query = "SELECT d FROM DataTest d WHERE d.wtt007 = :wtt007")
    , @NamedQuery(name = "DataTest.findByWtt010", query = "SELECT d FROM DataTest d WHERE d.wtt010 = :wtt010")
    , @NamedQuery(name = "DataTest.findByWtt011", query = "SELECT d FROM DataTest d WHERE d.wtt011 = :wtt011")
    , @NamedQuery(name = "DataTest.findByWtt012", query = "SELECT d FROM DataTest d WHERE d.wtt012 = :wtt012")
    , @NamedQuery(name = "DataTest.findByWtt016", query = "SELECT d FROM DataTest d WHERE d.wtt016 = :wtt016")
    , @NamedQuery(name = "DataTest.findByWtt030", query = "SELECT d FROM DataTest d WHERE d.wtt030 = :wtt030")
    , @NamedQuery(name = "DataTest.findByWtt031", query = "SELECT d FROM DataTest d WHERE d.wtt031 = :wtt031")
    , @NamedQuery(name = "DataTest.findByWtt034", query = "SELECT d FROM DataTest d WHERE d.wtt034 = :wtt034")
    , @NamedQuery(name = "DataTest.findByIp001", query = "SELECT d FROM DataTest d WHERE d.ip001 = :ip001")
    , @NamedQuery(name = "DataTest.findByIg001", query = "SELECT d FROM DataTest d WHERE d.ig001 = :ig001")
    , @NamedQuery(name = "DataTest.findByEp001", query = "SELECT d FROM DataTest d WHERE d.ep001 = :ep001")
    , @NamedQuery(name = "DataTest.findByMu002", query = "SELECT d FROM DataTest d WHERE d.mu002 = :mu002")
    , @NamedQuery(name = "DataTest.findByWrt001", query = "SELECT d FROM DataTest d WHERE d.wrt001 = :wrt001")
    , @NamedQuery(name = "DataTest.findByEf001", query = "SELECT d FROM DataTest d WHERE d.ef001 = :ef001")
    , @NamedQuery(name = "DataTest.findByGpt064", query = "SELECT d FROM DataTest d WHERE d.gpt064 = :gpt064")
    , @NamedQuery(name = "DataTest.findByAit006O2", query = "SELECT d FROM DataTest d WHERE d.ait006O2 = :ait006O2")
    , @NamedQuery(name = "DataTest.findByGtt002Sr600", query = "SELECT d FROM DataTest d WHERE d.gtt002Sr600 = :gtt002Sr600")
    , @NamedQuery(name = "DataTest.findByGtt003Sr600", query = "SELECT d FROM DataTest d WHERE d.gtt003Sr600 = :gtt003Sr600")
    , @NamedQuery(name = "DataTest.findByGtt004Sr600", query = "SELECT d FROM DataTest d WHERE d.gtt004Sr600 = :gtt004Sr600")
    , @NamedQuery(name = "DataTest.findByGpt004Sr600", query = "SELECT d FROM DataTest d WHERE d.gpt004Sr600 = :gpt004Sr600")
    , @NamedQuery(name = "DataTest.findByGft001Sr600", query = "SELECT d FROM DataTest d WHERE d.gft001Sr600 = :gft001Sr600")
    , @NamedQuery(name = "DataTest.findByArConcentration", query = "SELECT d FROM DataTest d WHERE d.arConcentration = :arConcentration")
    , @NamedQuery(name = "DataTest.findByHeConcentration", query = "SELECT d FROM DataTest d WHERE d.heConcentration = :heConcentration")
    , @NamedQuery(name = "DataTest.findByGpuSr600", query = "SELECT d FROM DataTest d WHERE d.gpuSr600 = :gpuSr600")
    , @NamedQuery(name = "DataTest.findByGpt003Sr600", query = "SELECT d FROM DataTest d WHERE d.gpt003Sr600 = :gpt003Sr600")
    , @NamedQuery(name = "DataTest.findByZZHDKWFoureau", query = "SELECT d FROM DataTest d WHERE d.zZHDKWFoureau = :zZHDKWFoureau")
    , @NamedQuery(name = "DataTest.findByZzHdkwHf", query = "SELECT d FROM DataTest d WHERE d.zzHdkwHf = :zzHdkwHf")
    , @NamedQuery(name = "DataTest.findByZZHDKWTorch", query = "SELECT d FROM DataTest d WHERE d.zZHDKWTorch = :zZHDKWTorch")
    , @NamedQuery(name = "DataTest.findByZZHDKWProbe", query = "SELECT d FROM DataTest d WHERE d.zZHDKWProbe = :zZHDKWProbe")
    , @NamedQuery(name = "DataTest.findByZZHDKWReactors", query = "SELECT d FROM DataTest d WHERE d.zZHDKWReactors = :zZHDKWReactors")
    , @NamedQuery(name = "DataTest.findByZZHDKWTotal", query = "SELECT d FROM DataTest d WHERE d.zZHDKWTotal = :zZHDKWTotal")
    , @NamedQuery(name = "DataTest.findByAcKw", query = "SELECT d FROM DataTest d WHERE d.acKw = :acKw")
    , @NamedQuery(name = "DataTest.findByACPIDReactorPressP", query = "SELECT d FROM DataTest d WHERE d.aCPIDReactorPressP = :aCPIDReactorPressP")
    , @NamedQuery(name = "DataTest.findByACPIDReactorPressI", query = "SELECT d FROM DataTest d WHERE d.aCPIDReactorPressI = :aCPIDReactorPressI")
    , @NamedQuery(name = "DataTest.findByACPIDReactorPressD", query = "SELECT d FROM DataTest d WHERE d.aCPIDReactorPressD = :aCPIDReactorPressD")})
public class DataTest implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Time")
    private Integer time;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AIT_006_N2")
    private Double ait006N2;
    @Column(name = "GPT_073")
    private Double gpt073;
    @Column(name = "CUST_002")
    private Double cust002;
    @Column(name = "Encodeur")
    private Double encodeur;
    @Column(name = "GMF_001")
    private Double gmf001;
    @Column(name = "GMF_005")
    private Double gmf005;
    @Column(name = "GMF_008")
    private Double gmf008;
    @Column(name = "GMF_009")
    private Double gmf009;
    @Column(name = "GMF_010")
    private Double gmf010;
    @Column(name = "GMF_011")
    private Double gmf011;
    @Column(name = "GMF_013")
    private Double gmf013;
    @Column(name = "GMF_020")
    private Double gmf020;
    @Column(name = "rampingstep")
    private Integer rampingstep;
    @Column(name = "ramping_count")
    private Integer rampingCount;
    @Column(name = "GPT_001")
    private Double gpt001;
    @Column(name = "GPT_003")
    private Double gpt003;
    @Column(name = "GPT_005")
    private Double gpt005;
    @Column(name = "GPT_006")
    private Double gpt006;
    @Column(name = "GPT_008")
    private Double gpt008;
    @Column(name = "GPT_009")
    private Double gpt009;
    @Column(name = "GPT_010")
    private Double gpt010;
    @Column(name = "GPT_014")
    private Double gpt014;
    @Column(name = "GPT_015")
    private Double gpt015;
    @Column(name = "GPT_016")
    private Double gpt016;
    @Column(name = "GPT_018")
    private Double gpt018;
    @Column(name = "GPT_027")
    private Double gpt027;
    @Column(name = "GPT_032")
    private Double gpt032;
    @Column(name = "GPT_036")
    private Double gpt036;
    @Column(name = "GPT_037")
    private Double gpt037;
    @Column(name = "GPU_003")
    private Double gpu003;
    @Column(name = "GTT_002")
    private Double gtt002;
    @Column(name = "GTT_004")
    private Double gtt004;
    @Column(name = "GTT_005")
    private Double gtt005;
    @Column(name = "GVE_001")
    private Double gve001;
    @Column(name = "WFT_001")
    private Double wft001;
    @Column(name = "WFT_002")
    private Double wft002;
    @Column(name = "WFT_003")
    private Double wft003;
    @Column(name = "WFT_004")
    private Double wft004;
    @Column(name = "WFT_022")
    private Double wft022;
    @Column(name = "WPT_001")
    private Double wpt001;
    @Column(name = "WTT_001")
    private Double wtt001;
    @Column(name = "WTT_002")
    private Double wtt002;
    @Column(name = "WTT_003")
    private Double wtt003;
    @Column(name = "WTT_004")
    private Double wtt004;
    @Column(name = "WTT_006")
    private Double wtt006;
    @Column(name = "WTT_007")
    private Double wtt007;
    @Column(name = "WTT_010")
    private Double wtt010;
    @Column(name = "WTT_011")
    private Double wtt011;
    @Column(name = "WTT_012")
    private Double wtt012;
    @Column(name = "WTT_016")
    private Double wtt016;
    @Column(name = "WTT_030")
    private Double wtt030;
    @Column(name = "WTT_031")
    private Double wtt031;
    @Column(name = "WTT_034")
    private Double wtt034;
    @Column(name = "IP_001")
    private Double ip001;
    @Column(name = "IG_001")
    private Double ig001;
    @Column(name = "EP_001")
    private Double ep001;
    @Column(name = "MU_002")
    private Integer mu002;
    @Column(name = "WRT_001")
    private Double wrt001;
    @Column(name = "EF_001")
    private Double ef001;
    @Column(name = "GPT_064")
    private Double gpt064;
    @Column(name = "AIT006_O2")
    private Double ait006O2;
    @Column(name = "GTT_002_SR600")
    private Integer gtt002Sr600;
    @Column(name = "GTT_003_SR600")
    private Integer gtt003Sr600;
    @Column(name = "GTT_004_SR600")
    private Integer gtt004Sr600;
    @Column(name = "GPT_004_SR600")
    private Integer gpt004Sr600;
    @Column(name = "GFT_001_SR600")
    private Integer gft001Sr600;
    @Column(name = "AR_CONCENTRATION")
    private Integer arConcentration;
    @Column(name = "HE_CONCENTRATION")
    private Integer heConcentration;
    @Column(name = "GPU_SR600")
    private Integer gpuSr600;
    @Column(name = "GPT_003_SR600")
    private Integer gpt003Sr600;
    @Column(name = "ZZ_HDKW_Foureau")
    private Double zZHDKWFoureau;
    @Column(name = "ZZ_HDKW_HF")
    private Double zzHdkwHf;
    @Column(name = "ZZ_HDKW_Torch")
    private Double zZHDKWTorch;
    @Column(name = "ZZ_HDKW_Probe")
    private Double zZHDKWProbe;
    @Column(name = "ZZ_HDKW_Reactors")
    private Double zZHDKWReactors;
    @Column(name = "ZZ_HDKW_Total")
    private Double zZHDKWTotal;
    @Column(name = "AC_KW")
    private Double acKw;
    @Column(name = "AC_PID_Reactor_Press_P")
    private Integer aCPIDReactorPressP;
    @Column(name = "AC_PID_Reactor_Press_I")
    private Integer aCPIDReactorPressI;
    @Column(name = "AC_PID_Reactor_Press_D")
    private Integer aCPIDReactorPressD;

    public DataTest() {
    }

    public DataTest(Integer time) {
        this.time = time;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        Integer oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public Double getAit006N2() {
        return ait006N2;
    }

    public void setAit006N2(Double ait006N2) {
        Double oldAit006N2 = this.ait006N2;
        this.ait006N2 = ait006N2;
        changeSupport.firePropertyChange("ait006N2", oldAit006N2, ait006N2);
    }

    public Double getGpt073() {
        return gpt073;
    }

    public void setGpt073(Double gpt073) {
        Double oldGpt073 = this.gpt073;
        this.gpt073 = gpt073;
        changeSupport.firePropertyChange("gpt073", oldGpt073, gpt073);
    }

    public Double getCust002() {
        return cust002;
    }

    public void setCust002(Double cust002) {
        Double oldCust002 = this.cust002;
        this.cust002 = cust002;
        changeSupport.firePropertyChange("cust002", oldCust002, cust002);
    }

    public Double getEncodeur() {
        return encodeur;
    }

    public void setEncodeur(Double encodeur) {
        Double oldEncodeur = this.encodeur;
        this.encodeur = encodeur;
        changeSupport.firePropertyChange("encodeur", oldEncodeur, encodeur);
    }

    public Double getGmf001() {
        return gmf001;
    }

    public void setGmf001(Double gmf001) {
        Double oldGmf001 = this.gmf001;
        this.gmf001 = gmf001;
        changeSupport.firePropertyChange("gmf001", oldGmf001, gmf001);
    }

    public Double getGmf005() {
        return gmf005;
    }

    public void setGmf005(Double gmf005) {
        Double oldGmf005 = this.gmf005;
        this.gmf005 = gmf005;
        changeSupport.firePropertyChange("gmf005", oldGmf005, gmf005);
    }

    public Double getGmf008() {
        return gmf008;
    }

    public void setGmf008(Double gmf008) {
        Double oldGmf008 = this.gmf008;
        this.gmf008 = gmf008;
        changeSupport.firePropertyChange("gmf008", oldGmf008, gmf008);
    }

    public Double getGmf009() {
        return gmf009;
    }

    public void setGmf009(Double gmf009) {
        Double oldGmf009 = this.gmf009;
        this.gmf009 = gmf009;
        changeSupport.firePropertyChange("gmf009", oldGmf009, gmf009);
    }

    public Double getGmf010() {
        return gmf010;
    }

    public void setGmf010(Double gmf010) {
        Double oldGmf010 = this.gmf010;
        this.gmf010 = gmf010;
        changeSupport.firePropertyChange("gmf010", oldGmf010, gmf010);
    }

    public Double getGmf011() {
        return gmf011;
    }

    public void setGmf011(Double gmf011) {
        Double oldGmf011 = this.gmf011;
        this.gmf011 = gmf011;
        changeSupport.firePropertyChange("gmf011", oldGmf011, gmf011);
    }

    public Double getGmf013() {
        return gmf013;
    }

    public void setGmf013(Double gmf013) {
        Double oldGmf013 = this.gmf013;
        this.gmf013 = gmf013;
        changeSupport.firePropertyChange("gmf013", oldGmf013, gmf013);
    }

    public Double getGmf020() {
        return gmf020;
    }

    public void setGmf020(Double gmf020) {
        Double oldGmf020 = this.gmf020;
        this.gmf020 = gmf020;
        changeSupport.firePropertyChange("gmf020", oldGmf020, gmf020);
    }

    public Integer getRampingstep() {
        return rampingstep;
    }

    public void setRampingstep(Integer rampingstep) {
        Integer oldRampingstep = this.rampingstep;
        this.rampingstep = rampingstep;
        changeSupport.firePropertyChange("rampingstep", oldRampingstep, rampingstep);
    }

    public Integer getRampingCount() {
        return rampingCount;
    }

    public void setRampingCount(Integer rampingCount) {
        Integer oldRampingCount = this.rampingCount;
        this.rampingCount = rampingCount;
        changeSupport.firePropertyChange("rampingCount", oldRampingCount, rampingCount);
    }

    public Double getGpt001() {
        return gpt001;
    }

    public void setGpt001(Double gpt001) {
        Double oldGpt001 = this.gpt001;
        this.gpt001 = gpt001;
        changeSupport.firePropertyChange("gpt001", oldGpt001, gpt001);
    }

    public Double getGpt003() {
        return gpt003;
    }

    public void setGpt003(Double gpt003) {
        Double oldGpt003 = this.gpt003;
        this.gpt003 = gpt003;
        changeSupport.firePropertyChange("gpt003", oldGpt003, gpt003);
    }

    public Double getGpt005() {
        return gpt005;
    }

    public void setGpt005(Double gpt005) {
        Double oldGpt005 = this.gpt005;
        this.gpt005 = gpt005;
        changeSupport.firePropertyChange("gpt005", oldGpt005, gpt005);
    }

    public Double getGpt006() {
        return gpt006;
    }

    public void setGpt006(Double gpt006) {
        Double oldGpt006 = this.gpt006;
        this.gpt006 = gpt006;
        changeSupport.firePropertyChange("gpt006", oldGpt006, gpt006);
    }

    public Double getGpt008() {
        return gpt008;
    }

    public void setGpt008(Double gpt008) {
        Double oldGpt008 = this.gpt008;
        this.gpt008 = gpt008;
        changeSupport.firePropertyChange("gpt008", oldGpt008, gpt008);
    }

    public Double getGpt009() {
        return gpt009;
    }

    public void setGpt009(Double gpt009) {
        Double oldGpt009 = this.gpt009;
        this.gpt009 = gpt009;
        changeSupport.firePropertyChange("gpt009", oldGpt009, gpt009);
    }

    public Double getGpt010() {
        return gpt010;
    }

    public void setGpt010(Double gpt010) {
        Double oldGpt010 = this.gpt010;
        this.gpt010 = gpt010;
        changeSupport.firePropertyChange("gpt010", oldGpt010, gpt010);
    }

    public Double getGpt014() {
        return gpt014;
    }

    public void setGpt014(Double gpt014) {
        Double oldGpt014 = this.gpt014;
        this.gpt014 = gpt014;
        changeSupport.firePropertyChange("gpt014", oldGpt014, gpt014);
    }

    public Double getGpt015() {
        return gpt015;
    }

    public void setGpt015(Double gpt015) {
        Double oldGpt015 = this.gpt015;
        this.gpt015 = gpt015;
        changeSupport.firePropertyChange("gpt015", oldGpt015, gpt015);
    }

    public Double getGpt016() {
        return gpt016;
    }

    public void setGpt016(Double gpt016) {
        Double oldGpt016 = this.gpt016;
        this.gpt016 = gpt016;
        changeSupport.firePropertyChange("gpt016", oldGpt016, gpt016);
    }

    public Double getGpt018() {
        return gpt018;
    }

    public void setGpt018(Double gpt018) {
        Double oldGpt018 = this.gpt018;
        this.gpt018 = gpt018;
        changeSupport.firePropertyChange("gpt018", oldGpt018, gpt018);
    }

    public Double getGpt027() {
        return gpt027;
    }

    public void setGpt027(Double gpt027) {
        Double oldGpt027 = this.gpt027;
        this.gpt027 = gpt027;
        changeSupport.firePropertyChange("gpt027", oldGpt027, gpt027);
    }

    public Double getGpt032() {
        return gpt032;
    }

    public void setGpt032(Double gpt032) {
        Double oldGpt032 = this.gpt032;
        this.gpt032 = gpt032;
        changeSupport.firePropertyChange("gpt032", oldGpt032, gpt032);
    }

    public Double getGpt036() {
        return gpt036;
    }

    public void setGpt036(Double gpt036) {
        Double oldGpt036 = this.gpt036;
        this.gpt036 = gpt036;
        changeSupport.firePropertyChange("gpt036", oldGpt036, gpt036);
    }

    public Double getGpt037() {
        return gpt037;
    }

    public void setGpt037(Double gpt037) {
        Double oldGpt037 = this.gpt037;
        this.gpt037 = gpt037;
        changeSupport.firePropertyChange("gpt037", oldGpt037, gpt037);
    }

    public Double getGpu003() {
        return gpu003;
    }

    public void setGpu003(Double gpu003) {
        Double oldGpu003 = this.gpu003;
        this.gpu003 = gpu003;
        changeSupport.firePropertyChange("gpu003", oldGpu003, gpu003);
    }

    public Double getGtt002() {
        return gtt002;
    }

    public void setGtt002(Double gtt002) {
        Double oldGtt002 = this.gtt002;
        this.gtt002 = gtt002;
        changeSupport.firePropertyChange("gtt002", oldGtt002, gtt002);
    }

    public Double getGtt004() {
        return gtt004;
    }

    public void setGtt004(Double gtt004) {
        Double oldGtt004 = this.gtt004;
        this.gtt004 = gtt004;
        changeSupport.firePropertyChange("gtt004", oldGtt004, gtt004);
    }

    public Double getGtt005() {
        return gtt005;
    }

    public void setGtt005(Double gtt005) {
        Double oldGtt005 = this.gtt005;
        this.gtt005 = gtt005;
        changeSupport.firePropertyChange("gtt005", oldGtt005, gtt005);
    }

    public Double getGve001() {
        return gve001;
    }

    public void setGve001(Double gve001) {
        Double oldGve001 = this.gve001;
        this.gve001 = gve001;
        changeSupport.firePropertyChange("gve001", oldGve001, gve001);
    }

    public Double getWft001() {
        return wft001;
    }

    public void setWft001(Double wft001) {
        Double oldWft001 = this.wft001;
        this.wft001 = wft001;
        changeSupport.firePropertyChange("wft001", oldWft001, wft001);
    }

    public Double getWft002() {
        return wft002;
    }

    public void setWft002(Double wft002) {
        Double oldWft002 = this.wft002;
        this.wft002 = wft002;
        changeSupport.firePropertyChange("wft002", oldWft002, wft002);
    }

    public Double getWft003() {
        return wft003;
    }

    public void setWft003(Double wft003) {
        Double oldWft003 = this.wft003;
        this.wft003 = wft003;
        changeSupport.firePropertyChange("wft003", oldWft003, wft003);
    }

    public Double getWft004() {
        return wft004;
    }

    public void setWft004(Double wft004) {
        Double oldWft004 = this.wft004;
        this.wft004 = wft004;
        changeSupport.firePropertyChange("wft004", oldWft004, wft004);
    }

    public Double getWft022() {
        return wft022;
    }

    public void setWft022(Double wft022) {
        Double oldWft022 = this.wft022;
        this.wft022 = wft022;
        changeSupport.firePropertyChange("wft022", oldWft022, wft022);
    }

    public Double getWpt001() {
        return wpt001;
    }

    public void setWpt001(Double wpt001) {
        Double oldWpt001 = this.wpt001;
        this.wpt001 = wpt001;
        changeSupport.firePropertyChange("wpt001", oldWpt001, wpt001);
    }

    public Double getWtt001() {
        return wtt001;
    }

    public void setWtt001(Double wtt001) {
        Double oldWtt001 = this.wtt001;
        this.wtt001 = wtt001;
        changeSupport.firePropertyChange("wtt001", oldWtt001, wtt001);
    }

    public Double getWtt002() {
        return wtt002;
    }

    public void setWtt002(Double wtt002) {
        Double oldWtt002 = this.wtt002;
        this.wtt002 = wtt002;
        changeSupport.firePropertyChange("wtt002", oldWtt002, wtt002);
    }

    public Double getWtt003() {
        return wtt003;
    }

    public void setWtt003(Double wtt003) {
        Double oldWtt003 = this.wtt003;
        this.wtt003 = wtt003;
        changeSupport.firePropertyChange("wtt003", oldWtt003, wtt003);
    }

    public Double getWtt004() {
        return wtt004;
    }

    public void setWtt004(Double wtt004) {
        Double oldWtt004 = this.wtt004;
        this.wtt004 = wtt004;
        changeSupport.firePropertyChange("wtt004", oldWtt004, wtt004);
    }

    public Double getWtt006() {
        return wtt006;
    }

    public void setWtt006(Double wtt006) {
        Double oldWtt006 = this.wtt006;
        this.wtt006 = wtt006;
        changeSupport.firePropertyChange("wtt006", oldWtt006, wtt006);
    }

    public Double getWtt007() {
        return wtt007;
    }

    public void setWtt007(Double wtt007) {
        Double oldWtt007 = this.wtt007;
        this.wtt007 = wtt007;
        changeSupport.firePropertyChange("wtt007", oldWtt007, wtt007);
    }

    public Double getWtt010() {
        return wtt010;
    }

    public void setWtt010(Double wtt010) {
        Double oldWtt010 = this.wtt010;
        this.wtt010 = wtt010;
        changeSupport.firePropertyChange("wtt010", oldWtt010, wtt010);
    }

    public Double getWtt011() {
        return wtt011;
    }

    public void setWtt011(Double wtt011) {
        Double oldWtt011 = this.wtt011;
        this.wtt011 = wtt011;
        changeSupport.firePropertyChange("wtt011", oldWtt011, wtt011);
    }

    public Double getWtt012() {
        return wtt012;
    }

    public void setWtt012(Double wtt012) {
        Double oldWtt012 = this.wtt012;
        this.wtt012 = wtt012;
        changeSupport.firePropertyChange("wtt012", oldWtt012, wtt012);
    }

    public Double getWtt016() {
        return wtt016;
    }

    public void setWtt016(Double wtt016) {
        Double oldWtt016 = this.wtt016;
        this.wtt016 = wtt016;
        changeSupport.firePropertyChange("wtt016", oldWtt016, wtt016);
    }

    public Double getWtt030() {
        return wtt030;
    }

    public void setWtt030(Double wtt030) {
        Double oldWtt030 = this.wtt030;
        this.wtt030 = wtt030;
        changeSupport.firePropertyChange("wtt030", oldWtt030, wtt030);
    }

    public Double getWtt031() {
        return wtt031;
    }

    public void setWtt031(Double wtt031) {
        Double oldWtt031 = this.wtt031;
        this.wtt031 = wtt031;
        changeSupport.firePropertyChange("wtt031", oldWtt031, wtt031);
    }

    public Double getWtt034() {
        return wtt034;
    }

    public void setWtt034(Double wtt034) {
        Double oldWtt034 = this.wtt034;
        this.wtt034 = wtt034;
        changeSupport.firePropertyChange("wtt034", oldWtt034, wtt034);
    }

    public Double getIp001() {
        return ip001;
    }

    public void setIp001(Double ip001) {
        Double oldIp001 = this.ip001;
        this.ip001 = ip001;
        changeSupport.firePropertyChange("ip001", oldIp001, ip001);
    }

    public Double getIg001() {
        return ig001;
    }

    public void setIg001(Double ig001) {
        Double oldIg001 = this.ig001;
        this.ig001 = ig001;
        changeSupport.firePropertyChange("ig001", oldIg001, ig001);
    }

    public Double getEp001() {
        return ep001;
    }

    public void setEp001(Double ep001) {
        Double oldEp001 = this.ep001;
        this.ep001 = ep001;
        changeSupport.firePropertyChange("ep001", oldEp001, ep001);
    }

    public Integer getMu002() {
        return mu002;
    }

    public void setMu002(Integer mu002) {
        Integer oldMu002 = this.mu002;
        this.mu002 = mu002;
        changeSupport.firePropertyChange("mu002", oldMu002, mu002);
    }

    public Double getWrt001() {
        return wrt001;
    }

    public void setWrt001(Double wrt001) {
        Double oldWrt001 = this.wrt001;
        this.wrt001 = wrt001;
        changeSupport.firePropertyChange("wrt001", oldWrt001, wrt001);
    }

    public Double getEf001() {
        return ef001;
    }

    public void setEf001(Double ef001) {
        Double oldEf001 = this.ef001;
        this.ef001 = ef001;
        changeSupport.firePropertyChange("ef001", oldEf001, ef001);
    }

    public Double getGpt064() {
        return gpt064;
    }

    public void setGpt064(Double gpt064) {
        Double oldGpt064 = this.gpt064;
        this.gpt064 = gpt064;
        changeSupport.firePropertyChange("gpt064", oldGpt064, gpt064);
    }

    public Double getAit006O2() {
        return ait006O2;
    }

    public void setAit006O2(Double ait006O2) {
        Double oldAit006O2 = this.ait006O2;
        this.ait006O2 = ait006O2;
        changeSupport.firePropertyChange("ait006O2", oldAit006O2, ait006O2);
    }

    public Integer getGtt002Sr600() {
        return gtt002Sr600;
    }

    public void setGtt002Sr600(Integer gtt002Sr600) {
        Integer oldGtt002Sr600 = this.gtt002Sr600;
        this.gtt002Sr600 = gtt002Sr600;
        changeSupport.firePropertyChange("gtt002Sr600", oldGtt002Sr600, gtt002Sr600);
    }

    public Integer getGtt003Sr600() {
        return gtt003Sr600;
    }

    public void setGtt003Sr600(Integer gtt003Sr600) {
        Integer oldGtt003Sr600 = this.gtt003Sr600;
        this.gtt003Sr600 = gtt003Sr600;
        changeSupport.firePropertyChange("gtt003Sr600", oldGtt003Sr600, gtt003Sr600);
    }

    public Integer getGtt004Sr600() {
        return gtt004Sr600;
    }

    public void setGtt004Sr600(Integer gtt004Sr600) {
        Integer oldGtt004Sr600 = this.gtt004Sr600;
        this.gtt004Sr600 = gtt004Sr600;
        changeSupport.firePropertyChange("gtt004Sr600", oldGtt004Sr600, gtt004Sr600);
    }

    public Integer getGpt004Sr600() {
        return gpt004Sr600;
    }

    public void setGpt004Sr600(Integer gpt004Sr600) {
        Integer oldGpt004Sr600 = this.gpt004Sr600;
        this.gpt004Sr600 = gpt004Sr600;
        changeSupport.firePropertyChange("gpt004Sr600", oldGpt004Sr600, gpt004Sr600);
    }

    public Integer getGft001Sr600() {
        return gft001Sr600;
    }

    public void setGft001Sr600(Integer gft001Sr600) {
        Integer oldGft001Sr600 = this.gft001Sr600;
        this.gft001Sr600 = gft001Sr600;
        changeSupport.firePropertyChange("gft001Sr600", oldGft001Sr600, gft001Sr600);
    }

    public Integer getArConcentration() {
        return arConcentration;
    }

    public void setArConcentration(Integer arConcentration) {
        Integer oldArConcentration = this.arConcentration;
        this.arConcentration = arConcentration;
        changeSupport.firePropertyChange("arConcentration", oldArConcentration, arConcentration);
    }

    public Integer getHeConcentration() {
        return heConcentration;
    }

    public void setHeConcentration(Integer heConcentration) {
        Integer oldHeConcentration = this.heConcentration;
        this.heConcentration = heConcentration;
        changeSupport.firePropertyChange("heConcentration", oldHeConcentration, heConcentration);
    }

    public Integer getGpuSr600() {
        return gpuSr600;
    }

    public void setGpuSr600(Integer gpuSr600) {
        Integer oldGpuSr600 = this.gpuSr600;
        this.gpuSr600 = gpuSr600;
        changeSupport.firePropertyChange("gpuSr600", oldGpuSr600, gpuSr600);
    }

    public Integer getGpt003Sr600() {
        return gpt003Sr600;
    }

    public void setGpt003Sr600(Integer gpt003Sr600) {
        Integer oldGpt003Sr600 = this.gpt003Sr600;
        this.gpt003Sr600 = gpt003Sr600;
        changeSupport.firePropertyChange("gpt003Sr600", oldGpt003Sr600, gpt003Sr600);
    }

    public Double getZZHDKWFoureau() {
        return zZHDKWFoureau;
    }

    public void setZZHDKWFoureau(Double zZHDKWFoureau) {
        Double oldZZHDKWFoureau = this.zZHDKWFoureau;
        this.zZHDKWFoureau = zZHDKWFoureau;
        changeSupport.firePropertyChange("ZZHDKWFoureau", oldZZHDKWFoureau, zZHDKWFoureau);
    }

    public Double getZzHdkwHf() {
        return zzHdkwHf;
    }

    public void setZzHdkwHf(Double zzHdkwHf) {
        Double oldZzHdkwHf = this.zzHdkwHf;
        this.zzHdkwHf = zzHdkwHf;
        changeSupport.firePropertyChange("zzHdkwHf", oldZzHdkwHf, zzHdkwHf);
    }

    public Double getZZHDKWTorch() {
        return zZHDKWTorch;
    }

    public void setZZHDKWTorch(Double zZHDKWTorch) {
        Double oldZZHDKWTorch = this.zZHDKWTorch;
        this.zZHDKWTorch = zZHDKWTorch;
        changeSupport.firePropertyChange("ZZHDKWTorch", oldZZHDKWTorch, zZHDKWTorch);
    }

    public Double getZZHDKWProbe() {
        return zZHDKWProbe;
    }

    public void setZZHDKWProbe(Double zZHDKWProbe) {
        Double oldZZHDKWProbe = this.zZHDKWProbe;
        this.zZHDKWProbe = zZHDKWProbe;
        changeSupport.firePropertyChange("ZZHDKWProbe", oldZZHDKWProbe, zZHDKWProbe);
    }

    public Double getZZHDKWReactors() {
        return zZHDKWReactors;
    }

    public void setZZHDKWReactors(Double zZHDKWReactors) {
        Double oldZZHDKWReactors = this.zZHDKWReactors;
        this.zZHDKWReactors = zZHDKWReactors;
        changeSupport.firePropertyChange("ZZHDKWReactors", oldZZHDKWReactors, zZHDKWReactors);
    }

    public Double getZZHDKWTotal() {
        return zZHDKWTotal;
    }

    public void setZZHDKWTotal(Double zZHDKWTotal) {
        Double oldZZHDKWTotal = this.zZHDKWTotal;
        this.zZHDKWTotal = zZHDKWTotal;
        changeSupport.firePropertyChange("ZZHDKWTotal", oldZZHDKWTotal, zZHDKWTotal);
    }

    public Double getAcKw() {
        return acKw;
    }

    public void setAcKw(Double acKw) {
        Double oldAcKw = this.acKw;
        this.acKw = acKw;
        changeSupport.firePropertyChange("acKw", oldAcKw, acKw);
    }

    public Integer getACPIDReactorPressP() {
        return aCPIDReactorPressP;
    }

    public void setACPIDReactorPressP(Integer aCPIDReactorPressP) {
        Integer oldACPIDReactorPressP = this.aCPIDReactorPressP;
        this.aCPIDReactorPressP = aCPIDReactorPressP;
        changeSupport.firePropertyChange("ACPIDReactorPressP", oldACPIDReactorPressP, aCPIDReactorPressP);
    }

    public Integer getACPIDReactorPressI() {
        return aCPIDReactorPressI;
    }

    public void setACPIDReactorPressI(Integer aCPIDReactorPressI) {
        Integer oldACPIDReactorPressI = this.aCPIDReactorPressI;
        this.aCPIDReactorPressI = aCPIDReactorPressI;
        changeSupport.firePropertyChange("ACPIDReactorPressI", oldACPIDReactorPressI, aCPIDReactorPressI);
    }

    public Integer getACPIDReactorPressD() {
        return aCPIDReactorPressD;
    }

    public void setACPIDReactorPressD(Integer aCPIDReactorPressD) {
        Integer oldACPIDReactorPressD = this.aCPIDReactorPressD;
        this.aCPIDReactorPressD = aCPIDReactorPressD;
        changeSupport.firePropertyChange("ACPIDReactorPressD", oldACPIDReactorPressD, aCPIDReactorPressD);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (time != null ? time.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataTest)) {
            return false;
        }
        DataTest other = (DataTest) object;
        if ((this.time == null && other.time != null) || (this.time != null && !this.time.equals(other.time))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "plasma2.DataTest[ time=" + time + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
