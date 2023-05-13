package AJP;
import java.io.*;
import java.net.*;
import java.util.*;

public class InetDemo2 {

public static void main(String[] args) throws UnknownHostException
{
System.out.println("InetAddress of Local Host : " + address1);
InetAddress address2 = InetAddress.getByName("45.22.30.39"); System.out.println("InetAddress of Named Host : " + address2);

InetAddress address3[] = InetAddress.getAllByName("172.19.25.29");
for (int i = 0; i < address3.length; i++) {
System.out.println( "ALL InetAddresses of Named Host : " + address3[i]);
}
