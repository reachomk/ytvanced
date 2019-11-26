package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@qlp
/* renamed from: qmq */
public final class qmq {
    public static void a(String str) {
        String str2 = "Error while pinging URL: ";
        String str3 = ". ";
        String str4;
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder;
        try {
            str4 = "Pinging URL: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = new String(str4);
            } else {
                str4.concat(valueOf);
            }
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            rlj.a();
            qmh.a(httpURLConnection);
            qmm qmm = new qmm();
            qmm.a();
            int responseCode = httpURLConnection.getResponseCode();
            qmm.a();
            if (responseCode < 200 || responseCode >= 300) {
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 65);
                stringBuilder.append("Received non-success response code ");
                stringBuilder.append(responseCode);
                stringBuilder.append(" from pinging URL: ");
                stringBuilder.append(str);
                qml.b(stringBuilder.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(str2).length());
            stringBuilder2.append("Error while parsing ping URL: ");
            stringBuilder2.append(str);
            stringBuilder2.append(str3);
            stringBuilder2.append(str2);
            qml.b(stringBuilder2.toString());
        } catch (IOException e2) {
            str4 = e2.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str4).length());
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(str3);
            stringBuilder.append(str4);
            qml.b(stringBuilder.toString());
        } catch (RuntimeException e3) {
            str4 = e3.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str4).length());
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(str3);
            stringBuilder.append(str4);
            qml.b(stringBuilder.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
