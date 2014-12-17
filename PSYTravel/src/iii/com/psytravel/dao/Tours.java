package iii.com.psytravel.dao;

import java.util.Date;

import android.media.Image;

public class Tours {
	
	private int matour;
	private Image imagetitle;
	private String tentours;
	private String diemden;
	private Date ngaykhoihanh;
	private float gia_tien;
	private String gioithieu;
	public int getMatour() {
		return matour;
	}
	public void setMatour(int matour) {
		this.matour = matour;
	}
	public Image getImagetitle() {
		return imagetitle;
	}
	public void setImagetitle(Image imagetitle) {
		this.imagetitle = imagetitle;
	}
	public String getTentours() {
		return tentours;
	}
	public void setTentours(String tentours) {
		this.tentours = tentours;
	}
	public String getDiemden() {
		return diemden;
	}
	public void setDiemden(String diemden) {
		this.diemden = diemden;
	}
	public Date getNgaykhoihanh() {
		return ngaykhoihanh;
	}
	public void setNgaykhoihanh(Date ngaykhoihanh) {
		this.ngaykhoihanh = ngaykhoihanh;
	}
	public float getGia_tien() {
		return gia_tien;
	}
	public void setGia_tien(float gia_tien) {
		this.gia_tien = gia_tien;
	}
	public String getGioithieu() {
		return gioithieu;
	}
	public void setGioithieu(String gioithieu) {
		this.gioithieu = gioithieu;
	}
	

}
