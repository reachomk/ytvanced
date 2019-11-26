package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: zlx */
public final class zlx extends AsyncTask {
    private final /* synthetic */ String a;
    private final /* synthetic */ zlw b;

    public zlx(zlw zlw, String str) {
        this.b = zlw;
        this.a = str;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        byte[] toByteArray;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.a));
            xln xln = new xln();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                xln.write(bArr, 0, read);
            }
            toByteArray = xln.toByteArray();
        } catch (IOException e) {
            xtl.a("Error reading video effects state file", e);
            toByteArray = null;
        }
        if (toByteArray != null) {
            try {
                bada bada = (bada) anxl.parseFrom(bada.b, toByteArray, anxa.c());
                zla zla = this.b.b;
                babp babp = (babp) babm.c.createBuilder();
                babp.copyOnWrite();
                babm babm = (babm) babp.instance;
                if (bada != null) {
                    babm.b = bada;
                    babm.a = 3;
                    zla.a.add((babm) ((anxl) babp.build()));
                } else {
                    throw new NullPointerException();
                }
            } catch (anyg e2) {
                xtl.a("Unable to parse video effect state event", e2);
            }
        }
        return null;
    }
}
