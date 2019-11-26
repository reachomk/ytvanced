package defpackage;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import net.openid.appauth.AuthorizationManagementActivity;

/* renamed from: bcfu */
public final class bcfu {
    public final bcgl a;
    private Context b;
    private final bcgk c;
    private boolean d;

    public bcfu(Context context) {
        bcgj bcgj = bcfk.a.b;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(bcgm.a, VERSION.SDK_INT >= 23 ? 131136 : 64)) {
            if (resolveInfo.filter.hasAction("android.intent.action.VIEW") && resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") && resolveInfo.filter.schemesIterator() != null && resolveInfo.filter.authoritiesIterator() == null) {
                Iterator schemesIterator = resolveInfo.filter.schemesIterator();
                int i = 0;
                int i2 = 0;
                while (schemesIterator.hasNext()) {
                    String str = (String) schemesIterator.next();
                    i |= "http".equals(str);
                    i2 |= "https".equals(str);
                    if (i != 0) {
                        if (i2 != 0) {
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 64);
                                String str2 = resolveInfo.activityInfo.packageName;
                                Intent intent = new Intent();
                                intent.setAction("android.support.customtabs.action.CustomTabsService");
                                intent.setPackage(str2);
                                if (packageManager.resolveService(intent, 0) != null) {
                                    arrayList.add(new bcgk(packageInfo, true));
                                }
                                arrayList.add(new bcgk(packageInfo, false));
                            } catch (NameNotFoundException unused) {
                            }
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        bcgk bcgk = null;
        for (int i3 = 0; i3 < size; i3++) {
            bcgk bcgk2 = (bcgk) arrayList.get(i3);
            bcgj.a();
            if (bcgk2.b.booleanValue()) {
                bcgk = bcgk2;
                break;
            }
            if (bcgk == null) {
                bcgk = bcgk2;
            }
        }
        bcgl bcgl = new bcgl(context);
        this.d = false;
        this.b = (Context) bcgg.a(context);
        this.a = bcgl;
        this.c = bcgk;
        if (bcgk != null && bcgk.b.booleanValue()) {
            this.a.a(bcgk.a);
        }
    }

    public final void a(bcfr bcfr, PendingIntent pendingIntent, PendingIntent pendingIntent2, aud aud) {
        b();
        bcgg.a(bcfr);
        bcgg.a(pendingIntent);
        bcgg.a(aud);
        b();
        if (this.c != null) {
            Intent intent;
            String str = "client_id";
            str = "response_type";
            Builder appendQueryParameter = bcfr.b.a.buildUpon().appendQueryParameter("redirect_uri", bcfr.h.toString()).appendQueryParameter(str, bcfr.c).appendQueryParameter(str, bcfr.g);
            bcgs.a(appendQueryParameter, "display", bcfr.d);
            bcgs.a(appendQueryParameter, "login_hint", bcfr.e);
            bcgs.a(appendQueryParameter, "prompt", bcfr.f);
            bcgs.a(appendQueryParameter, "state", bcfr.j);
            bcgs.a(appendQueryParameter, "scope", bcfr.i);
            bcgs.a(appendQueryParameter, "response_mode", bcfr.n);
            if (bcfr.k != null) {
                String str2 = "code_challenge_method";
                appendQueryParameter.appendQueryParameter("code_challenge", bcfr.l).appendQueryParameter(str2, bcfr.m);
            }
            for (Entry entry : bcfr.o.entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri build = appendQueryParameter.build();
            if (this.c.b.booleanValue()) {
                intent = aud.a;
            } else {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.setPackage(this.c.a);
            intent.setData(build);
            bcgn.a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.c.b.toString());
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
            bcgn.a("Initiating authorization request to %s", bcfr.b.a);
            Context context = this.b;
            Intent a = AuthorizationManagementActivity.a(context);
            a.putExtra("authIntent", intent);
            a.putExtra("authRequest", bcfr.b());
            a.putExtra("completeIntent", pendingIntent);
            a.putExtra("cancelIntent", pendingIntent2);
            context.startActivity(a);
            return;
        }
        throw new ActivityNotFoundException();
    }

    public final void a() {
        if (!this.d) {
            this.a.a();
            this.d = true;
        }
    }

    public final void b() {
        if (this.d) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }
}
