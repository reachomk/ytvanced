package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ggj */
public final class ggj {
    public final Context a;
    public final Executor b;
    public amul c = amul.g();
    private final Object d = new Object();
    private final gkt e;
    private final Map f;
    private final Map g;

    public ggj(Context context, Executor executor, gkt gkt) {
        this.a = context;
        this.b = executor;
        this.e = gkt;
        this.f = new HashMap();
        this.g = new HashMap();
    }

    public static int a() {
        return awq.a().c();
    }

    public final amul a(String str) {
        str = (String) this.g.get(str);
        if (this.f.get(str) == null) {
            return amul.g();
        }
        return amul.a((Collection) this.f.get(str));
    }

    private static boolean b(String str) {
        awq a = awq.a();
        aad.a(a.d(), "Not initialized yet");
        aad.a((Object) str, (Object) "sequence cannot be null");
        return a.c.a((CharSequence) str);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (ggj.a() != 1) {
            afpc.a(2, afpf.upload, "VideoFX: Reading emoji from device failed");
            return;
        }
        String str;
        try {
            List<String> a;
            if (this.e.a()) {
                a = a((int) R.raw.emoji_list_with_variations);
                Collection arrayList = new ArrayList();
                for (String c : a) {
                    List c2 = amqz.a(",").c(c);
                    String str2 = (String) c2.get(0);
                    String str3 = (String) c2.get(1);
                    String str4 = null;
                    if (c2.size() == 3 && !((String) c2.get(2)).isEmpty()) {
                        str4 = (String) c2.get(2);
                    }
                    ggg ggg = new ggg(str2, str3, str4);
                    if (ggg.d()) {
                        this.g.put(ggg.a, ggg.c);
                        if (this.f.get(ggg.c) == null) {
                            this.f.put(ggg.c, new ArrayList());
                        }
                        ((List) this.f.get(ggg.c)).add(ggg.a);
                    }
                    if ((!ggg.d() || ggg.b.equals(ggg.c)) && ggj.b(ggg.a)) {
                        arrayList.add(ggg.a);
                    }
                }
                synchronized (this.d) {
                    this.c = amul.a(arrayList);
                }
                return;
            }
            a = a((int) R.raw.emoji_list);
            Collection arrayList2 = new ArrayList();
            for (String str5 : a) {
                if (ggj.b(str5)) {
                    arrayList2.add(str5);
                }
            }
            synchronized (this.d) {
                this.c = amul.a(arrayList2);
            }
        } catch (IOException e) {
            afpf afpf = afpf.upload;
            String valueOf = String.valueOf(e.getMessage());
            str5 = "VideoFX: Reading emoji from device failed ";
            if (valueOf.length() == 0) {
                valueOf = new String(str5);
            } else {
                valueOf = str5.concat(valueOf);
            }
            afpc.a(2, afpf, valueOf);
        }
    }

    private final List a(int i) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getResources().openRawResource(i), ampv.c));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }
}
