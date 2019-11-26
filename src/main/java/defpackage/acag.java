package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.youtube.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: acag */
public final class acag {
    public static acaf a(Context context, int i) {
        return new acaf(acag.b(context, R.raw.simple_vert), acag.b(context, i));
    }

    private static String b(Context context, int i) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                stringBuilder2.append(readLine);
                stringBuilder2.append("\n");
            }
            return stringBuilder2.toString();
        } catch (IOException e) {
            stringBuilder = new StringBuilder(36);
            stringBuilder.append("Error on loading shader: ");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString(), e);
        } catch (NotFoundException e2) {
            stringBuilder = new StringBuilder(38);
            stringBuilder.append("Shader resource not found: ");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString(), e2);
        }
    }
}
