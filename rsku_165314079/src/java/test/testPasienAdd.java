/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.pasienHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Pasien;

/**
 *
 * @author basisa20
 */
public class testPasienAdd {
    public static void main(String[] args){
        try{
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String tglLahir = "19741231";
        Date date = format.parse(tglLahir);
        String noRm = "696969";
        String nama = "Tundun";
        pasienHelper helper = new pasienHelper();
        String alamat ="Sintang";
        String kelamin ="Lelaki";
        helper.addNewPasien(noRm, nama, alamat, noRm, date, kelamin);
        } catch (ParseException ex){
           
        }
    }
}
