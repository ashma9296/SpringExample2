package com.abc.sp;

public class OfficePojo {
	
	private Integer floor;
	private  String floorname;
	private Integer roomno;
	private Integer noOfRestroom;
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getFloorname() {
		return floorname;
	}
	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}
	public Integer getRoomno() {
		return roomno;
	}
	public void setRoomno(Integer roomno) {
		this.roomno = roomno;
	}
	public Integer getNoOfRestroom() {
		return noOfRestroom;
	}
	public void setNoOfRestroom(Integer noOfRestroom) {
		this.noOfRestroom = noOfRestroom;
	}
	@Override
	public String toString() {
		return "OfficePojo [floor=" + floor + ", floorname=" + floorname + ", roomno=" + roomno + ", noOfRestroom="
				+ noOfRestroom + "]";
	}
	
	
	
	

}
