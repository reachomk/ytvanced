package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.util.Set;

/* renamed from: zoa */
final class zoa extends AsyncTask {
    private final /* synthetic */ azaj a;
    private final /* synthetic */ Set b;
    private final /* synthetic */ znv c;

    zoa(znv znv, azaj azaj, Set set) {
        this.c = znv;
        this.a = azaj;
        this.b = set;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        String valueOf;
        String str;
        znp znp = this.c.a;
        anyd<String> anyd = this.a.e;
        xak.b();
        znp.c();
        if (!(anyd == null || anyd.isEmpty())) {
            String.valueOf(anyd).length();
            for (String valueOf2 : anyd) {
                File file = new File(znp.a, valueOf2);
                if (file.exists()) {
                    synchronized (znp.d) {
                        try {
                            file.delete();
                            String.valueOf(valueOf2).length();
                            znp.e.remove(valueOf2);
                        } catch (SecurityException e) {
                            str = "unable to delete asset: ";
                            valueOf2 = String.valueOf(valueOf2);
                            if (valueOf2.length() == 0) {
                                valueOf2 = new String(str);
                            } else {
                                valueOf2 = str.concat(valueOf2);
                            }
                            xtl.a(valueOf2, e);
                        }
                    }
                }
            }
        }
        znp = this.c.a;
        Set<String> set = this.b;
        xak.b();
        znp.c();
        if (!(set == null || set.isEmpty())) {
            String.valueOf(set).length();
            for (String str2 : set) {
                str = Uri.parse(str2).getLastPathSegment();
                synchronized (znp.d) {
                    if (znp.e.contains(str)) {
                        znp.f.a(str2, str);
                    } else {
                        String str3 = "httpRequestQueue.add: ";
                        valueOf2 = String.valueOf(str2);
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(str3);
                        } else {
                            str3.concat(valueOf2);
                        }
                        znp.c.b(new znr(znp, str2, new zns(str2), str, str2));
                    }
                }
            }
        }
        return null;
    }
}
