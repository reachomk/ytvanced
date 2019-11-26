package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.bcfl;
import defpackage.bcfn;
import defpackage.bcfo;
import defpackage.bcfr;
import defpackage.bcfs;
import defpackage.bcfv;
import defpackage.bcgb;
import defpackage.bcgg;
import defpackage.bcgn;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthorizationManagementActivity extends Activity {
    private boolean a = false;
    private Intent b;
    private bcfr c;
    private PendingIntent d;
    private PendingIntent e;

    public static Intent a(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a(getIntent().getExtras());
        } else {
            a(bundle);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        if (this.a) {
            if (getIntent().getData() != null) {
                a();
            } else {
                b();
            }
            finish();
            return;
        }
        startActivity(this.b);
        this.a = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.a);
        bundle.putParcelable("authIntent", this.b);
        bundle.putString("authRequest", this.c.b());
        bundle.putParcelable("completeIntent", this.d);
        bundle.putParcelable("cancelIntent", this.e);
    }

    private final void a() {
        Intent a;
        Uri data = getIntent().getData();
        String str = "error";
        if (data.getQueryParameterNames().contains(str)) {
            Uri uri;
            String queryParameter = data.getQueryParameter(str);
            String queryParameter2 = data.getQueryParameter("error_description");
            str = data.getQueryParameter("error_uri");
            bcfl bcfl = (bcfl) bcfo.f.get(queryParameter);
            if (bcfl == null) {
                bcfl = bcfo.d;
            }
            int i = bcfl.a;
            int i2 = bcfl.b;
            if (queryParameter2 == null) {
                queryParameter2 = bcfl.d;
            }
            String str2 = queryParameter2;
            if (str == null) {
                uri = bcfl.e;
            } else {
                uri = Uri.parse(str);
            }
            a = new bcfl(i, i2, queryParameter, str2, uri).a();
        } else {
            bcfv bcfv = new bcfv(this.c);
            str = "state";
            bcfv.a(data.getQueryParameter(str));
            String str3 = "token_type";
            bcfv.b(data.getQueryParameter(str3));
            String str4 = "code";
            bcfv.c(data.getQueryParameter(str4));
            String str5 = "access_token";
            bcfv.d(data.getQueryParameter(str5));
            String queryParameter3 = data.getQueryParameter("expires_in");
            Long valueOf = queryParameter3 != null ? Long.valueOf(Long.parseLong(queryParameter3)) : null;
            if (valueOf != null) {
                bcfv.a = Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(valueOf.longValue()));
            } else {
                bcfv.a = null;
            }
            queryParameter3 = "id_token";
            bcfv.e(data.getQueryParameter(queryParameter3));
            String str6 = "scope";
            bcfv.f(data.getQueryParameter(str6));
            Set set = bcfs.a;
            Map linkedHashMap = new LinkedHashMap();
            for (String str7 : data.getQueryParameterNames()) {
                if (!set.contains(str7)) {
                    linkedHashMap.put(str7, data.getQueryParameter(str7));
                }
            }
            bcfv.a(linkedHashMap);
            bcfs a2 = bcfv.a();
            String str8 = this.c.j;
            if ((str8 != null || a2.c == null) && (str8 == null || str8.equals(a2.c))) {
                Intent intent = new Intent();
                JSONObject jSONObject = new JSONObject();
                bcgb.a(jSONObject, "request", a2.b.a());
                bcgb.b(jSONObject, str, a2.c);
                bcgb.b(jSONObject, str3, a2.d);
                bcgb.b(jSONObject, str4, a2.e);
                bcgb.b(jSONObject, str5, a2.f);
                Long l = a2.g;
                bcgg.a((Object) jSONObject, (Object) "json must not be null");
                Object obj = "expires_at";
                bcgg.a(obj, (Object) "field must not be null");
                if (l != null) {
                    try {
                        jSONObject.put(obj, l);
                    } catch (JSONException e) {
                        throw new IllegalStateException("JSONException thrown in violation of contract", e);
                    }
                }
                bcgb.b(jSONObject, queryParameter3, a2.h);
                bcgb.b(jSONObject, str6, a2.i);
                bcgb.a(jSONObject, "additional_parameters", bcgb.a(a2.j));
                intent.putExtra("net.openid.appauth.AuthorizationResponse", jSONObject.toString());
                a = intent;
            } else {
                bcgn.c("State returned in authorization response (%s) does not match state from request (%s) - discarding response", a2.c, this.c.j);
                a = bcfo.e.a();
            }
        }
        if (a != null) {
            a.setData(data);
            if (this.d != null) {
                bcgn.a("Authorization complete - invoking completion intent", new Object[0]);
                try {
                    this.d.send(this, 0, a);
                    return;
                } catch (CanceledException e2) {
                    bcgn.d("Failed to send completion intent", e2);
                    return;
                }
            }
            setResult(-1, a);
            return;
        }
        bcgn.d("Failed to extract OAuth2 response from redirect", new Object[0]);
    }

    private final void b() {
        bcgn.a("Authorization flow canceled by user", new Object[0]);
        bcfl bcfl = bcfn.b;
        Intent a = new bcfl(bcfl.a, bcfl.b, bcfl.c, bcfl.d, bcfl.e).a();
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, a);
                return;
            } catch (CanceledException e) {
                bcgn.d("Failed to send cancel intent", e);
                return;
            }
        }
        setResult(0, a);
        bcgn.a("No cancel intent set - will return to previous activity", new Object[0]);
    }

    private final void a(Bundle bundle) {
        if (bundle != null) {
            this.b = (Intent) bundle.getParcelable("authIntent");
            this.a = bundle.getBoolean("authStarted", false);
            try {
                bcfr bcfr = null;
                String string = bundle.getString("authRequest", null);
                if (string != null) {
                    bcfr = bcfr.a(string);
                }
                this.c = bcfr;
                this.d = (PendingIntent) bundle.getParcelable("completeIntent");
                this.e = (PendingIntent) bundle.getParcelable("cancelIntent");
                return;
            } catch (JSONException e) {
                throw new IllegalStateException("Unable to deserialize authorization request", e);
            }
        }
        bcgn.c("No stored state - unable to handle response", new Object[0]);
        finish();
    }
}
