package defpackage;

import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: bcpe */
public final class bcpe extends HttpURLConnection {
    public final bcpj a = new bcpj();
    public bckx b;
    public final bcpf c = new bcpf(this);
    public bcpi d;
    public bclb e;
    public IOException f;
    public boolean g;
    private final bciz h;
    private final List i = new ArrayList();
    private boolean j;
    private List k;
    private Map l;

    public bcpe(URL url, bciz bciz) {
        super(url);
        this.h = bciz;
    }

    public final void setConnectTimeout(int i) {
    }

    public final boolean usingProxy() {
        return false;
    }

    public final void connect() {
        getOutputStream();
        b();
    }

    public final void disconnect() {
        if (this.connected) {
            this.b.c();
        }
    }

    public final String getResponseMessage() {
        c();
        return this.e.c();
    }

    public final int getResponseCode() {
        c();
        return this.e.b();
    }

    public final Map getHeaderFields() {
        try {
            c();
            return e();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public final String getHeaderField(String str) {
        try {
            c();
            Map e = e();
            if (e.containsKey(str)) {
                List list = (List) e.get(str);
                return (String) list.get(list.size() - 1);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public final String getHeaderFieldKey(int i) {
        Entry a = a(i);
        return a != null ? (String) a.getKey() : null;
    }

    public final String getHeaderField(int i) {
        Entry a = a(i);
        return a != null ? (String) a.getValue() : null;
    }

    public final InputStream getInputStream() {
        c();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.e.b() < 400) {
            return this.c;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    public final OutputStream getOutputStream() {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (d()) {
                this.d = new bcpa(this.chunkLength, this.a);
                b();
            } else {
                long a = a();
                if (a != -1) {
                    this.d = new bcpc(a, this.a);
                    b();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = new bcoy();
                    } else {
                        this.d = new bcoy(Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }

    private final long a() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j2 == -1 ? j : j2;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return j;
        }
    }

    private final void b() {
        if (!this.connected) {
            bcjl bcjl = (bcjl) this.h.a(getURL().toString(), new bcpd(this), this.a);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                bcpi bcpi = this.d;
                String str = "Content-Length";
                if (bcpi != null) {
                    bcjl.a(bcpi.c(), this.a);
                    if (getRequestProperty(str) == null && !d()) {
                        addRequestProperty(str, Long.toString(this.d.c().a()));
                    }
                    this.d.a();
                } else if (getRequestProperty(str) == null) {
                    addRequestProperty(str, "0");
                }
                String str2 = "Content-Type";
                if (getRequestProperty(str2) == null) {
                    addRequestProperty(str2, "application/x-www-form-urlencoded");
                }
            }
            for (Pair pair : this.i) {
                bcjl.a((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                bcjl.a();
            }
            bcjl.a(this.method);
            this.b = bcjl.c();
            this.b.a();
            this.connected = true;
        }
    }

    public final InputStream getErrorStream() {
        try {
            c();
            if (this.e.b() >= 400) {
                return this.c;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void addRequestProperty(String str, String str2) {
        a(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        a(str, str2, true);
    }

    private final void a(String str, String str2, boolean z) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int a = a(str);
        if (a >= 0) {
            if (z) {
                this.i.remove(a);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot add multiple headers of the same key, ");
                stringBuilder.append(str);
                stringBuilder.append(". crbug.com/432719.");
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
        this.i.add(Pair.create(str, str2));
    }

    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : this.i) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public final String getRequestProperty(String str) {
        int a = a(str);
        return a >= 0 ? (String) ((Pair) this.i.get(a)).second : null;
    }

    private final int a(String str) {
        for (int i = 0; i < this.i.size(); i++) {
            if (((String) ((Pair) this.i.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    private final void c() {
        bcpi bcpi = this.d;
        if (bcpi != null) {
            bcpi.b();
            if (d()) {
                this.d.close();
            }
        }
        if (!this.j) {
            b();
            this.a.a();
        }
        if (this.j) {
            IOException iOException = this.f;
            if (iOException != null) {
                throw iOException;
            } else if (this.e == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            } else {
                return;
            }
        }
        throw new IllegalStateException("No response.");
    }

    private final Entry a(int i) {
        try {
            c();
            List f = f();
            if (i < f.size()) {
                return (Entry) f.get(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    private final boolean d() {
        return this.chunkLength > 0;
    }

    private final Map e() {
        Map map = this.l;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Entry entry : f()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        this.l = Collections.unmodifiableMap(treeMap);
        return this.l;
    }

    private final List f() {
        List list = this.k;
        if (list != null) {
            return list;
        }
        this.k = new ArrayList();
        for (Entry entry : this.e.d()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.k.add(new SimpleImmutableEntry(entry));
            }
        }
        this.k = Collections.unmodifiableList(this.k);
        return this.k;
    }

    static {
        bcpe.class.getSimpleName();
    }
}
