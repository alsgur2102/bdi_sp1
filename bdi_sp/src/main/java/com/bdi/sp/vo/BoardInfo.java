package com.bdi.sp.vo;

public class BoardInfo {

	private Integer binum;
	private String bititle;
	private String bifile;
	private String bicredat;
	private String bimoddat;
	private Integer bicnt;
	private Integer biactive;
	private Integer uinum;
	
	public Integer getBinum() {
		return binum;
	}
	public void setBinum(Integer binum) {
		this.binum = binum;
	}
	public String getBititle() {
		return bititle;
	}
	public void setBititle(String bititle) {
		this.bititle = bititle;
	}
	public String getBifile() {
		return bifile;
	}
	public void setBifile(String bifile) {
		this.bifile = bifile;
	}
	public String getBicredat() {
		return bicredat;
	}
	public void setBicredat(String bicredat) {
		this.bicredat = bicredat;
	}
	public String getBimoddat() {
		return bimoddat;
	}
	public void setBimoddat(String bimoddat) {
		this.bimoddat = bimoddat;
	}
	public Integer getBicnt() {
		return bicnt;
	}
	public void setBicnt(Integer bicnt) {
		this.bicnt = bicnt;
	}
	public Integer getBiactive() {
		return biactive;
	}
	public void setBiactive(Integer biactive) {
		this.biactive = biactive;
	}
	public Integer getUinum() {
		return uinum;
	}
	public void setUinum(Integer uinum) {
		this.uinum = uinum;
	}
	
	@Override
	public String toString() {
		return "BoardInfo [binum=" + binum + ", bititle=" + bititle + ", bifile=" + bifile + ", bicredat=" + bicredat
				+ ", bimoddat=" + bimoddat + ", bicnt=" + bicnt + ", biactive=" + biactive + ", uinum=" + uinum + "]";
	}
}
