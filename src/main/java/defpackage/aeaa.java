package defpackage;

import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: aeaa */
final class aeaa extends AsyncTask {
    private final /* synthetic */ aeab a;

    aeaa(aeab aeab) {
        this.a = aeab;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            this.a.b.a(((xhc[]) objArr)[0]);
        } catch (IOException unused) {
            String str = "IOException while calling the TV Sign-in progress API";
            xtl.a(aeab.a, str);
            afpc.a(2, afpf.mdx, str);
        }
        return null;
    }
}
