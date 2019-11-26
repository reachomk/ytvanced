package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: addo */
public final class addo {
    public static final String a = xtl.b("MDX.SsdpFinder");
    public static final Object b = new Object();
    public static DatagramPacket j;
    private static final Pattern m = Pattern.compile("^(.+?): (.+)$");
    public final String c;
    public final ScheduledExecutorService d;
    public final adcy e;
    public final xgq f;
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map h;
    public boolean i;
    public final addm k;
    public final aebl l;
    private final adcu n;
    private final bcaa o;
    private final Set p = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Set q = Collections.newSetFromMap(new ConcurrentHashMap());
    private final addr r;
    private final boolean s;
    private final acum t;
    private final xsc u;
    private final Map v = new HashMap();
    private final boolean w;

    public addo(boolean z, String str, adcu adcu, bcaa bcaa, xgq xgq, adcy adcy, aebl aebl, acum acum, xsc xsc, boolean z2) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new xaf("mdxSsdp"));
        addl addl = new addl();
        this.d = newScheduledThreadPool;
        this.h = new ConcurrentHashMap();
        this.s = z;
        this.c = str;
        this.e = adcy;
        this.r = adcy.c;
        this.n = adcu;
        this.o = bcaa;
        this.f = xgq;
        this.k = addl;
        this.l = aebl;
        this.t = acum;
        this.u = xsc;
        this.w = z2;
    }

    public final void a(addr addr, boolean z) {
        this.q.add(addr);
        if (this.i) {
            for (adiq a : this.p) {
                addr.a(a);
            }
            return;
        }
        if (z) {
            adcy adcy = this.e;
            Object obj = adcy.a.e() ? adcy.a.h()[2] : "";
            adcw adcw = adcy.d;
            adcv a2 = adcw.a(adcw.a());
            String str = "<unknown ssid>";
            Iterator it = null;
            if (!(a2 == null || a2.a().equals(str))) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) adcw.get(a2);
                if (concurrentHashMap != null) {
                    it = concurrentHashMap.entrySet().iterator();
                }
            }
            while (it != null && it.hasNext()) {
                Entry entry = (Entry) it.next();
                adjg adjg = (adjg) entry.getKey();
                adda adda = (adda) entry.getValue();
                if (!(adda == null || !adda.e() || !adda.d().equals(obj) || obj.equals(str) || adda.d().equals(str) || TextUtils.isEmpty(adda.b()))) {
                    adip a3 = adiq.q().a(adjg).a(adda.a()).e(adda.b()).a(adda.c());
                    a3.a(false);
                    addr.a(a3.b());
                }
            }
        }
        this.i = true;
        this.d.execute(new addn(this));
    }

    public final void a(addr addr) {
        this.q.remove(addr);
    }

    public final synchronized void a(String str, adiq adiq, Map map) {
        String f;
        String c;
        Object obj = null;
        if (adiq.j()) {
            String str2 = (String) map.get("WAKEUP");
            if (str2 != null) {
                if (((addj) this.o.get()).a(3, addh.a(3, adiq.e(), adiq.f(), adiq.g()))) {
                    String str3 = null;
                    int i = -1;
                    for (String str4 : str2.split(";")) {
                        String str42;
                        if (str42.startsWith("MAC=")) {
                            str3 = str42.substring(4);
                            str42 = adiq.c();
                            String valueOf = String.valueOf(adiq.d());
                            String.valueOf(str42).length();
                            valueOf.length();
                            String.valueOf(str3).length();
                        } else if (str42.startsWith("Timeout=")) {
                            try {
                                str42 = str42.substring(8);
                                i = Integer.parseInt(str42);
                                String.valueOf(adiq.d()).length();
                                String.valueOf(str42).length();
                            } catch (NumberFormatException e) {
                                xtl.a(a, "Unable to parse wake-up timeout value: ", e);
                            }
                        } else {
                            continue;
                        }
                    }
                    adiq = adiq.p().e(str3).a(i).b();
                } else {
                    str2 = adiq.e();
                    f = adiq.f();
                    String.valueOf(str2).length();
                    String.valueOf(f).length();
                }
            }
        }
        this.h.put(str, adiq);
        if (adiq.j()) {
            adhw a = this.n.a(adiq.a());
            if (addo.a(a)) {
                Uri build = adiq.bu_().buildUpon().appendPath("YouTube").build();
                if (!build.equals(adiq.a())) {
                    adiq = adiq.p().a(build).b();
                    a = this.n.a(adiq.a());
                }
            }
            if (addo.a(a)) {
                f = a;
                c = adiq.c();
                int b = a.b();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(c).length() + 33);
                stringBuilder.append("Dropping TV: ");
                stringBuilder.append(c);
                stringBuilder.append(" status: ");
                stringBuilder.append(b);
                xtl.c(f, stringBuilder.toString());
            } else {
                if (((addj) this.o.get()).a(2, addh.a(3, adiq.e(), adiq.f(), adiq.g()))) {
                    if (this.s) {
                        if (!a.e() && (adiq.e() == null || !adiq.e().equals("Google Inc."))) {
                            if (adiq.f() != null) {
                                if (!adiq.f().equals("Eureka Dongle")) {
                                }
                            }
                        }
                        c = adiq.c();
                        a.b();
                        String.valueOf(c).length();
                    }
                    obj = adiq.a(a);
                } else {
                    f = adiq.e();
                    String f2 = adiq.f();
                    String.valueOf(f).length();
                    String.valueOf(f2).length();
                    c = adiq.c();
                    a.b();
                    String.valueOf(c).length();
                }
            }
        }
        if (obj != null) {
            this.p.add(obj);
            for (addr a2 : this.q) {
                a2.a(obj);
            }
            this.r.a(obj);
            Map m = obj.m();
            if (!(m == null || m.isEmpty() || "c0ef1ca".equals(m.get("testYWRkaXR")))) {
                long a3 = this.u.a();
                f = obj.b();
                Long l = (Long) this.v.get(f);
                if (l == null || a3 - l.longValue() > TimeUnit.DAYS.toMillis(1)) {
                    this.v.put(f, Long.valueOf(a3));
                    aups aups = (aups) aupp.e.createBuilder();
                    c = obj.c();
                    aups.copyOnWrite();
                    aupp aupp = (aupp) aups.instance;
                    if (c != null) {
                        aupp.a |= 1;
                        aupp.b = c;
                        c = obj.e();
                        if (c != null) {
                            aups.copyOnWrite();
                            aupp = (aupp) aups.instance;
                            aupp.a = 4 | aupp.a;
                            aupp.d = c;
                        }
                        c = obj.f();
                        if (c != null) {
                            aups.copyOnWrite();
                            aupp = (aupp) aups.instance;
                            aupp.a = 2 | aupp.a;
                            aupp.c = c;
                        }
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        asmw.c = (anxl) aups.build();
                        asmw.b = 93;
                        this.t.a((asmw) ((anxl) asmz.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        }
    }

    private static boolean a(adhw adhw) {
        return adhw.b() == -2 || adhw.b() == -1 || adhw.b() == 0;
    }

    public final void a(DatagramSocket datagramSocket) {
        int i;
        int i2 = 2000;
        try {
            datagramSocket.setSoTimeout(2000);
        } catch (SocketException e) {
            xtl.a(a, "Error setting socket timeout", e);
        }
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
        byte[] bArr = new byte[512];
        ArrayList arrayList = new ArrayList();
        while (true) {
            Object obj;
            long currentTimeMillis = System.currentTimeMillis();
            i = 0;
            try {
                datagramSocket.receive(datagramPacket);
                obj = 1;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e2) {
                if (!datagramSocket.isClosed()) {
                    xtl.a(a, "Error receiving m search response packet", e2);
                }
                obj = null;
            }
            i2 -= (int) (System.currentTimeMillis() - currentTimeMillis);
            if (i2 <= 0) {
                break;
            } else if (obj != null) {
                String str;
                String str2 = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                if (this.w) {
                    str = "ssdp response: ";
                    if (str2.length() == 0) {
                        String str3 = new String(str);
                    } else {
                        str.concat(str2);
                    }
                }
                Map hashMap = new HashMap();
                Matcher matcher = m.matcher("");
                Scanner scanner = new Scanner(str2);
                while (scanner.hasNextLine()) {
                    matcher.reset(scanner.nextLine());
                    if (matcher.matches()) {
                        hashMap.put(matcher.group(1).toUpperCase(Locale.US), matcher.group(2));
                    }
                }
                scanner.close();
                Object obj2 = null;
                if ("urn:dial-multiscreen-org:service:dial:1".equals(hashMap.get("ST"))) {
                    str2 = (String) hashMap.get("LOCATION");
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(Uri.parse(str2).getHost())) {
                        str = a;
                        str2 = String.valueOf(str2);
                        String str4 = "Ignoring device with unusable LOCATION: ";
                        if (str2.length() == 0) {
                            str2 = new String(str4);
                        } else {
                            str2 = str4.concat(str2);
                        }
                        xtl.b(str, str2);
                    } else if (!this.g.contains(str2)) {
                        this.g.add(str2);
                        if (this.h.containsKey(str2)) {
                            a(str2, (adiq) this.h.get(str2), hashMap);
                        } else {
                            obj2 = this.d.submit(new addq(this, str2, hashMap, bArr));
                        }
                    }
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        int size = arrayList.size();
        long j = 7300;
        for (i2 = 0; i2 < size; i2++) {
            Future future = (Future) arrayList.get(i2);
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                future.get(j, TimeUnit.MILLISECONDS);
                j = Math.max(0, j - (System.currentTimeMillis() - currentTimeMillis2));
            } catch (InterruptedException unused2) {
                xtl.a(a, "Read device response task cancelled while waiting for reading device description task to complete");
                size = arrayList.size();
                while (i < size) {
                    ((Future) arrayList.get(i)).cancel(true);
                    i++;
                }
                return;
            } catch (ExecutionException e3) {
                xtl.a(a, "Error waiting for reading device description task to complete", e3);
            } catch (TimeoutException e32) {
                xtl.a(a, "Timed out whilst reading device description", e32);
            }
        }
    }

    public static String a(Element element, String str, String str2) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if ((item instanceof Element) && str.equals(item.getLocalName()) && str2.equals(item.getNamespaceURI())) {
                return item.getTextContent();
            }
        }
        return null;
    }

    public final void a() {
        this.g.clear();
        this.p.clear();
    }
}
