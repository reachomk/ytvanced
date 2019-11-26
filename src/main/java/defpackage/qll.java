package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Binder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@qlp
/* renamed from: qll */
public final class qll implements qln {
    public static final Object a = new Object();
    public static qln b = null;
    private final Context c;
    private final ExecutorService d = Executors.newCachedThreadPool();
    private final qmp e;

    public qll(Context context) {
        qmp qmp = new qmp();
        Object obj = new Object();
        WeakHashMap weakHashMap = new WeakHashMap();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.c = context;
        this.e = qmp;
    }

    public final void a(Throwable th, String str) {
        if (qmh.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            rbp.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (Math.random() < 1.0d) {
                boolean a;
                String nameForUid;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                try {
                    qpi a2 = qph.a(this.c);
                    if (Binder.getCallingUid() == Process.myUid()) {
                        a = qpf.a(a2.a);
                    } else {
                        if (qbf.c()) {
                            nameForUid = a2.a.getPackageManager().getNameForUid(Binder.getCallingUid());
                            if (nameForUid != null) {
                                a = a2.a.getPackageManager().isInstantApp(nameForUid);
                            }
                        }
                        a = false;
                    }
                } catch (Throwable th2) {
                    qml.a("Error fetching instant app info", th2);
                }
                try {
                    nameForUid = this.c.getPackageName();
                } catch (Throwable unused) {
                    qml.b("Cannot obtain package name, proceeding.");
                    nameForUid = "unknown";
                }
                String str2 = "os";
                str2 = "api";
                Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(a)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(str2, VERSION.RELEASE).appendQueryParameter(str2, String.valueOf(VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                str2 = Build.MODEL;
                if (!str2.startsWith(str3)) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 1) + str2.length());
                    stringBuilder.append(str3);
                    stringBuilder.append(" ");
                    stringBuilder.append(str2);
                    str2 = stringBuilder.toString();
                }
                name = "session_id";
                name = "sampling_rate";
                name = "pb_tm";
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str2).appendQueryParameter("js", this.e.a).appendQueryParameter("appid", nameForUid).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", roe.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "211705629").appendQueryParameter("rc", "dev").appendQueryParameter(name, rlj.a.b).appendQueryParameter(name, Integer.toString(1)).appendQueryParameter(name, String.valueOf(rlj.d().a(roe.s))).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    str = (String) obj;
                    this.d.submit(new qlo(new qmq(), str));
                }
            }
        }
    }
}
