package com.example.dack_renthouse;

public class cPhong {
    private int idPhong;
    private String tenPhong;
    private int tienPhong;
    private int idChuPhong;
    private String noiThat;
    private String ghiChu;
    private String tinhTrang;

    public cPhong(int idPhong, String tenPhong, int tienPhong, int idChuPhong, String noiThat, String ghiChu, String tinhTrang) {
        this.idPhong = idPhong;
        this.tenPhong = tenPhong;
        this.tienPhong = tienPhong;
        this.idChuPhong = idChuPhong;
        this.noiThat = noiThat;
        this.ghiChu = ghiChu;
        this.tinhTrang = tinhTrang;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(int tienPhong) {
        this.tienPhong = tienPhong;
    }

    public int getIdChuPhong() {
        return idChuPhong;
    }

    public void setIdChuPhong(int idChuPhong) {
        this.idChuPhong = idChuPhong;
    }

    public String getNoiThat() {
        return noiThat;
    }

    public void setNoiThat(String noiThat) {
        this.noiThat = noiThat;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
