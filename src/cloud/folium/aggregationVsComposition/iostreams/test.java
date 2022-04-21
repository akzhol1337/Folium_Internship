package cloud.folium.aggregationVsSegregation.iostreams;

import java.io.*;

public class test {
    public static void main(String[] args) {

        File file = new File("./src/cloud/folium/aggregationvscomposition/iostreams/file.txt");
        File file2 = new File("./src/cloud/folium/aggregationvscomposition/iostreams/file2.txt");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(file2);
        ) {
            byte bytes[] = new byte[(int) file.length()];
            fis.read(bytes);
            fos.write(bytes);

            try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
                int data;
                while ((data = bais.read()) != -1) {
                    System.out.print(data);
                }
                System.out.println();
                baos.write(bytes);
                System.out.println(baos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
