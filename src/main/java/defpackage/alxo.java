package defpackage;

import android.content.SharedPreferences;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: alxo */
public final class alxo implements alxr {
    private final File a;
    private boolean b = false;

    public alxo(SharedPreferences sharedPreferences) {
        amqw.a((Object) sharedPreferences);
        String string = sharedPreferences.getString("system_health_metric_disk_output_dir", null);
        if (string != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            String valueOf = String.valueOf(File.separator);
            this.a = new File(externalStorageDirectory, string.length() == 0 ? new String(valueOf) : valueOf.concat(string));
            return;
        }
        this.a = null;
    }

    public final void a(aydm aydm) {
        File file = this.a;
        if (file != null) {
            if (!file.exists()) {
                this.a.mkdirs();
            }
            this.b = true;
        }
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(aycn aycn) {
        c(aycn);
    }

    public final void b(aycn aycn) {
        c(aycn);
    }

    private final File c(aycn aycn) {
        if (this.b && aycn != null) {
            try {
                String str;
                Locale locale = Locale.ENGLISH;
                String str2 = "%d-%s-";
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(System.currentTimeMillis());
                try {
                    int i = ((bcfe) anxl.parseFrom(bcfe.x, aycn.e.d(), anxa.c())).a;
                    if ((i & 64) != 0) {
                        str = "crash";
                    } else if ((i & 256) != 0) {
                        str = "disk";
                    } else if ((i & 1) != 0) {
                        str = "memory";
                    } else if ((i & 32) == 0) {
                        if ((i & 128) != 0) {
                            str = "stats";
                        }
                        str = "unknown";
                    } else {
                        str = "network";
                    }
                } catch (anyg e) {
                    ankx.a(e);
                }
                objArr[1] = str;
                File createTempFile = File.createTempFile(String.format(locale, str2, objArr), ".capture", this.a);
                anbk.a(aycn.toByteArray(), createTempFile);
                return createTempFile;
            } catch (IOException e2) {
                ankx.a(e2);
            }
        }
        return null;
    }
}
