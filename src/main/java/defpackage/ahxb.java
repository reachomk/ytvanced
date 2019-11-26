package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: ahxb */
public final class ahxb {
    private final Context a;
    private final SparseArray b = new SparseArray();

    public ahxb(Context context) {
        this.a = context;
    }

    public final String a(int i) {
        String str = (String) this.b.get(i, null);
        if (str != null) {
            return str;
        }
        try {
            InputStream openRawResource = this.a.getResources().openRawResource(i);
            byte[] bArr = new byte[openRawResource.available()];
            if (openRawResource.read(bArr) > 0) {
                str = new String(bArr, Charset.defaultCharset());
                this.b.put(i, str);
                return str;
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            str = "Error retrieving resource: ";
            xtl.a("ShaderSourceCache", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        return "";
    }
}
