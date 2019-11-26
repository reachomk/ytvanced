package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;

/* renamed from: bcnj */
final class bcnj implements bcnw {
    private final /* synthetic */ bcmw a;

    bcnj(bcmw bcmw) {
        this.a = bcmw;
    }

    public final void a() {
        if (((Integer) this.a.g.get()).intValue() != 8) {
            bcmw bcmw;
            URL url = new URL(this.a.m);
            HttpURLConnection httpURLConnection = this.a.q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.a.q = null;
            }
            this.a.q = (HttpURLConnection) url.openConnection();
            boolean z = false;
            this.a.q.setInstanceFollowRedirects(false);
            String str = "User-Agent";
            if (!this.a.e.containsKey(str)) {
                bcmw = this.a;
                bcmw.e.put(str, bcmw.d);
            }
            for (Entry entry : this.a.e.entrySet()) {
                this.a.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            bcmw = this.a;
            if (bcmw.i == null) {
                bcmw.i = "GET";
            }
            bcmw.q.setRequestMethod(bcmw.i);
            bcmw = this.a;
            bcou bcou = bcmw.j;
            if (bcou == null) {
                bcmw.l = 10;
                this.a.q.connect();
                this.a.d();
                return;
            }
            bcmw.r = new bcnx(bcmw, bcmw.k, bcmw.c, bcmw.q, bcou);
            bcmw = this.a;
            bcnx bcnx = bcmw.r;
            if (bcmw.f.size() == 1) {
                z = true;
            }
            bcnx.a(new bcod(bcnx, z));
        }
    }
}
