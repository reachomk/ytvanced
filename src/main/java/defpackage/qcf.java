package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: qcf */
public final class qcf {
    public final Context a;
    public final qaw b;
    public final List c = new ArrayList();

    public qcf(Context context) {
        qaz qaz = qaz.a;
        this.a = context;
        this.b = qaz;
    }

    public final qci a(qch qch) {
        qci a = a(qch.a);
        if (!a.b()) {
            return null;
        }
        a(a);
        return a;
    }

    public static File a(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public final void a(qci qci) {
        String str = "Failed to touch last-used file for ";
        File file = qci.c;
        StringBuilder stringBuilder;
        String valueOf;
        try {
            String str2 = ".";
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    String valueOf2 = String.valueOf(qci);
                    stringBuilder = new StringBuilder(valueOf2.length() + 36);
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(str2);
                    throw new qcg(stringBuilder.toString());
                }
            }
            if (!file.setLastModified(this.b.a())) {
                valueOf = String.valueOf(qci);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 42);
                stringBuilder2.append("Failed to update last-used timestamp for ");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(str2);
                throw new qcg(stringBuilder2.toString());
            }
        } catch (IOException e) {
            valueOf = String.valueOf(qci);
            String valueOf3 = String.valueOf(e);
            stringBuilder = new StringBuilder((valueOf.length() + 37) + valueOf3.length());
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf3);
            throw new qcg(stringBuilder.toString());
        }
    }

    public final qci a(String str) {
        File file = new File(qcf.a(this.a), str);
        return new qci(new File(file, "the.apk"), new File(file, "opt"), new File(file, "t"));
    }

    public final qci a() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        String str = "tmp_";
        return a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    public final void b() {
        for (File file : this.c) {
            if (!qqf.a(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
                stringBuilder.append("Failed to clean up temporary file ");
                stringBuilder.append(valueOf);
                stringBuilder.append(".");
                Log.e("DG", stringBuilder.toString());
            }
        }
        this.c.clear();
    }

    public static void a(File file, File file2) {
        if (!file.renameTo(file2)) {
            String valueOf = String.valueOf(file);
            String valueOf2 = String.valueOf(file2);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 22) + valueOf2.length());
            stringBuilder.append("Failed to rename ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" -> ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(".");
            throw new qcg(stringBuilder.toString());
        }
    }
}
