package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vul */
public final class vul implements vuh, wxg {
    public final vui a;
    public final aage b;
    private final Executor c;
    private final afti d;
    private final vrk e;

    public vul(Executor executor, afti afti, vui vui, aage aage, vrk vrk) {
        this.c = (Executor) amqw.a((Object) executor);
        this.d = (afti) amqw.a((Object) afti);
        this.a = (vui) amqw.a((Object) vui);
        this.b = aage;
        this.e = (vrk) amqw.a((Object) vrk);
    }

    public final boolean a(List list, boolean z) {
        aftl[] aftlArr = new aftl[1];
        int i = 0;
        aftlArr[0] = aftl.f;
        if (list.size() <= 0) {
            return false;
        }
        int size = list.size();
        while (i < size) {
            Entry entry = (Entry) list.get(i);
            Uri uri = (Uri) entry.getKey();
            List<Entry> list2 = (List) entry.getValue();
            if (!(uri == null || Uri.EMPTY.equals(uri))) {
                Uri a = a(uri, aftlArr);
                afti afti = this.d;
                ArrayList arrayList = new ArrayList();
                for (Entry entry2 : list2) {
                    Matcher matcher = afti.b.matcher((CharSequence) entry2.getValue());
                    StringBuffer stringBuffer = new StringBuffer();
                    while (matcher.find()) {
                        if (matcher.groupCount() == 1) {
                            String a2 = afti.a(uri, matcher.group(1), aftlArr);
                            if (a2 != null) {
                                matcher.appendReplacement(stringBuffer, Uri.encode(a2));
                            }
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    arrayList.add(new SimpleEntry((String) entry2.getKey(), stringBuffer.toString()));
                }
                this.c.execute(new vum(this, a, arrayList, z));
            }
            i++;
        }
        return true;
    }

    public final boolean a(List list) {
        return a(list, aftl.f);
    }

    public final boolean a(aftl... aftlArr) {
        return a(null, null, aftlArr);
    }

    public final boolean a(List list, Pattern pattern, aftl... aftlArr) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (Uri a : list) {
            a(a, pattern, aftlArr);
        }
        return true;
    }

    public final boolean a(List list, aftl... aftlArr) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (aojo a : list) {
            a(a, aftlArr);
        }
        return true;
    }

    public final void a(Uri uri, Pattern pattern) {
        a(uri, pattern, aftl.f);
    }

    private final void a(Uri uri, Pattern pattern, aftl... aftlArr) {
        if (uri != null && !Uri.EMPTY.equals(uri)) {
            this.c.execute(new vun(this, a(uri, aftlArr), pattern));
        }
    }

    public final void a(aojo aojo) {
        a(aojo, aftl.f);
    }

    public final void a(aojo aojo, aftl... aftlArr) {
        a(aojo, Collections.emptyList(), true, aftlArr);
    }

    public final void a(aojo aojo, List list, boolean z, aftl... aftlArr) {
        Uri b = b(aojo);
        if (b != null && !Uri.EMPTY.equals(b)) {
            Uri a = a(b, aftlArr);
            a(a, aojo, a(a, list, z));
        }
    }

    public final void a(aojo aojo, byte[] bArr, aftl... aftlArr) {
        Uri b = b(aojo);
        if (b != null && !Uri.EMPTY.equals(b)) {
            Uri a = a(b, aftlArr);
            a(a, aojo, this.a.a(a, bArr, "vastad"));
        }
    }

    public final afqy a(Uri uri, List list, boolean z) {
        String str = "vastad";
        Iterator it;
        if (z) {
            Builder buildUpon = uri.buildUpon();
            for (Entry entry : list) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return this.a.a(buildUpon.build(), str);
        }
        byte[] bytes;
        try {
            String str2;
            StringBuilder stringBuilder = new StringBuilder();
            it = list.iterator();
            while (true) {
                str2 = "UTF-8";
                if (!it.hasNext()) {
                    break;
                }
                Entry entry2 = (Entry) it.next();
                stringBuilder.append(URLEncoder.encode((String) entry2.getKey(), str2));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry2.getValue(), str2));
                stringBuilder.append('&');
            }
            bytes = stringBuilder.toString().getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 28);
            stringBuilder2.append("Failed to encode post body. ");
            stringBuilder2.append(valueOf);
            xtl.c(stringBuilder2.toString());
            bytes = null;
        }
        return this.a.a(uri, bytes, str);
    }

    private final Uri b(aojo aojo) {
        Uri uri = null;
        try {
            uri = xvt.a(aojo.b);
        } catch (MalformedURLException unused) {
            String format = String.format("Badly formed uri in ABR path: %s", new Object[]{aojo.b});
            xtl.d(format);
            if (this.e.a) {
                afpc.a(1, afpf.ad, format);
                return uri;
            }
        }
        return uri;
    }

    private final void a(Uri uri, aojo aojo, afqy afqy) {
        this.c.execute(new vuk(this, uri, afqy, aojo));
    }

    private final Uri a(Uri uri, aftl... aftlArr) {
        try {
            return this.d.a(uri, aftlArr);
        } catch (xwd e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
            stringBuilder.append("Failed to substitute URI macros ");
            stringBuilder.append(valueOf);
            xtl.d(stringBuilder.toString());
            return null;
        }
    }
}
