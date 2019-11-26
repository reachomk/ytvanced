package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: usq */
public class usq implements utv, uud {
    public final SharedPreferences a;
    private final uzn c;
    private final usp d;
    private ust e;
    private uue f;
    private boolean g;
    private volatile boolean h = false;

    public usq(Context context, SharedPreferences sharedPreferences, uzn uzn, Executor executor) {
        uto uto = new uto((Context) amqw.a((Object) context), "identity.db");
        SharedPreferences sharedPreferences2 = (SharedPreferences) amqw.a((Object) sharedPreferences);
        uzn uzn2 = (uzn) amqw.a((Object) uzn);
        Executor executor2 = (Executor) amqw.a((Object) executor);
        this.a = sharedPreferences2;
        this.c = uzn2;
        this.d = new usp(uto, ankc.a(executor2));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0069 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Missing block: B:20:0x0067, code skipped:
            if (defpackage.uzn.b(r0.b(), r7.c.a()) == false) goto L_0x0069;
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            a(false);
     */
    private final synchronized void j() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.h;	 Catch:{ all -> 0x0079 }
        if (r0 != 0) goto L_0x0077;
    L_0x0005:
        r0 = r7.a;	 Catch:{ all -> 0x0079 }
        r1 = "user_account";
        r2 = 0;
        r0 = r0.getString(r1, r2);	 Catch:{ all -> 0x0079 }
        r1 = r7.a;	 Catch:{ all -> 0x0079 }
        r3 = "user_identity_id";
        r1 = r1.getString(r3, r2);	 Catch:{ all -> 0x0079 }
        r3 = r7.a;	 Catch:{ all -> 0x0079 }
        r4 = "datasync_id";
        r3 = r3.getString(r4, r2);	 Catch:{ all -> 0x0079 }
        r4 = 0;
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0052;
    L_0x0022:
        if (r1 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0052;
    L_0x0025:
        r5 = r7.a;	 Catch:{ all -> 0x0079 }
        r6 = "persona_account";
        r5 = r5.getBoolean(r6, r4);	 Catch:{ all -> 0x0079 }
        if (r5 == 0) goto L_0x0034;
    L_0x002f:
        r2 = defpackage.ust.a(r1, r0, r3);	 Catch:{ all -> 0x0079 }
        goto L_0x0052;
    L_0x0034:
        r3 = r7.a;	 Catch:{ all -> 0x0079 }
        r5 = "user_identity";
        r3 = r3.getString(r5, r2);	 Catch:{ all -> 0x0079 }
        r5 = "No +Page Delegate";
        r5 = r5.equals(r3);	 Catch:{ all -> 0x0079 }
        if (r5 == 0) goto L_0x0046;
    L_0x0044:
        r3 = "";
    L_0x0046:
        r5 = r7.a;	 Catch:{ all -> 0x0079 }
        r6 = "datasync_id";
        r2 = r5.getString(r6, r2);	 Catch:{ all -> 0x0079 }
        r2 = defpackage.ust.a(r1, r0, r3, r2);	 Catch:{ all -> 0x0079 }
    L_0x0052:
        r7.e = r2;	 Catch:{ all -> 0x0079 }
        r0 = r7.e;	 Catch:{ all -> 0x0079 }
        if (r0 != 0) goto L_0x0059;
    L_0x0058:
        goto L_0x006c;
    L_0x0059:
        r1 = r7.c;	 Catch:{ Exception -> 0x0069 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0069 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0069 }
        r0 = defpackage.uzn.b(r0, r1);	 Catch:{ Exception -> 0x0069 }
        if (r0 != 0) goto L_0x006c;
    L_0x0069:
        r7.a(r4);	 Catch:{ all -> 0x0079 }
    L_0x006c:
        r7.g = r4;	 Catch:{ all -> 0x0079 }
        r0 = defpackage.uue.a;	 Catch:{ all -> 0x0079 }
        r7.f = r0;	 Catch:{ all -> 0x0079 }
        r0 = 1;
        r7.h = r0;	 Catch:{ all -> 0x0079 }
        monitor-exit(r7);
        return;
    L_0x0077:
        monitor-exit(r7);
        return;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usq.j():void");
    }

    public final synchronized boolean a() {
        if (!this.h) {
            j();
        }
        return this.e != null;
    }

    public final synchronized boolean b() {
        return this.a.getBoolean(utl.USER_SIGNED_OUT, false);
    }

    public final synchronized afpt c() {
        if (!this.h) {
            j();
        }
        ust ust = this.e;
        if (ust != null) {
            return ust;
        }
        return afpt.g;
    }

    public final afpt a(String str) {
        xak.b();
        if (afpt.g.a().equals(str)) {
            return afpt.g;
        }
        return this.d.b(str);
    }

    public final synchronized uue d() {
        if (a()) {
            if (!this.g) {
                usp usp = this.d;
                ust ust = this.e;
                Cursor a = usp.a("profile", utw.a, ust.a());
                try {
                    uue uue;
                    if (a.moveToFirst()) {
                        String b = ust.b();
                        if (a.isNull(0)) {
                            uue = new uue(a.getString(3), a.getString(4), Uri.parse(a.getString(5)));
                        } else {
                            aaft aaft;
                            byte[] blob = a.getBlob(0);
                            byte[] blob2 = a.getBlob(1);
                            byte[] blob3 = a.getBlob(2);
                            arml arml = (arml) anxl.parseFrom(arml.f, blob, anxa.c());
                            aaft aaft2 = null;
                            if (blob2 == null) {
                                aaft = null;
                            } else {
                                aaft = new aaft((aygk) anxl.parseFrom(aygk.f, blob2));
                            }
                            if (blob3 != null) {
                                aaft2 = new aaft((aygk) anxl.parseFrom(aygk.f, blob3));
                            }
                            uue = new uue(b, arml, aaft, aaft2);
                        }
                        a.close();
                        this.f = uue;
                        this.g = true;
                    } else {
                        a.close();
                        uue = uue.a;
                        this.f = uue;
                        this.g = true;
                    }
                } catch (anyg e) {
                    try {
                        xtl.a("Error parsing profile data", e);
                        if (a != null) {
                            a.close();
                        }
                    } catch (Throwable th) {
                        if (a != null) {
                            a.close();
                        }
                    }
                }
            }
            return this.f;
        }
        return uue.a;
    }

    public final synchronized void a(ust ust) {
        xvd.a(ust.a());
        xvd.a(ust.b());
        this.a.edit().putString(utl.ACCOUNT_NAME, ust.b()).putString(utl.PAGE_ID, ust.c()).putBoolean(utl.PERSONA_ACCOUNT, ust.e()).putString(utl.EXTERNAL_ID, ust.a()).putBoolean(utl.USER_SIGNED_OUT, false).putInt(utl.IDENTITY_VERSION, 2).putString(utl.DATASYNC_ID, ust.f()).remove("pre_incognito_signed_in_user_id").remove("incognito_visitor_id").apply();
        usp usp = this.d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", ust.a());
        contentValues.put("account", ust.b());
        contentValues.put("page_id", ust.c());
        contentValues.put("is_persona", Integer.valueOf(ust.e()));
        contentValues.put(utl.DATASYNC_ID, ust.f());
        usp.a("identity", contentValues);
        this.e = ust;
        this.f = uue.a;
        this.g = false;
        this.h = true;
    }

    public final synchronized void a(uue uue) {
        if (a()) {
            this.f = uue;
            this.g = true;
            usp usp = this.d;
            String a = this.e.a();
            if (uue.equals(uue.a)) {
                usp.a(a);
                return;
            }
            arml arml = uue.c;
            if (arml != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", a);
                contentValues.put("profile_account_name_proto", arml.toByteArray());
                usp.a(contentValues, "profile_account_photo_thumbnails_proto", uue.e);
                usp.a(contentValues, "profile_mobile_banner_thumbnails_proto", uue.f);
                usp.a("profile", contentValues);
                return;
            }
            throw new IllegalArgumentException("accountNameProto cannot be null");
        }
    }

    public final synchronized void e() {
        if (a()) {
            this.f = uue.a;
            this.g = true;
            this.d.a(this.e.a());
        }
    }

    public final synchronized void a(boolean z) {
        this.a.edit().remove(utl.ACCOUNT_NAME).remove(utl.PAGE_ID).remove(utl.PERSONA_ACCOUNT).remove(utl.EXTERNAL_ID).remove(utl.USERNAME).remove(utl.DATASYNC_ID).putBoolean(utl.USER_SIGNED_OUT, z).putInt(utl.IDENTITY_VERSION, 2).apply();
        this.h = false;
        this.e = null;
        this.f = uue.a;
        this.g = true;
    }

    public final synchronized void b(String str) {
        if (a()) {
            this.a.edit().putString("pre_incognito_signed_in_user_id", c().a()).putString("incognito_visitor_id", str).apply();
        } else {
            this.a.edit().putString("incognito_visitor_id", str).apply();
        }
    }

    public final synchronized void f() {
        ust ust = null;
        String string = this.a.getString("pre_incognito_signed_in_user_id", null);
        if (string != null) {
            ust = (ust) this.d.b(string);
        }
        this.a.edit().remove("pre_incognito_signed_in_user_id").remove("incognito_visitor_id").apply();
        if (ust != null) {
            a(ust);
        }
    }

    public final boolean g() {
        return this.a.getString("incognito_visitor_id", null) != null;
    }

    public final synchronized String h() {
        if (g()) {
            return this.a.getString("incognito_visitor_id", null);
        }
        return this.a.getString("visitor_id", null);
    }

    public final int i() {
        return this.a.getInt(utl.IDENTITY_VERSION, 2);
    }

    public final List a(Account[] accountArr) {
        int length;
        xak.b();
        amqw.a((Object) accountArr);
        String[] strArr = new String[accountArr.length];
        int i = 0;
        while (true) {
            length = strArr.length;
            if (i >= length) {
                break;
            }
            strArr[i] = accountArr[i].name;
            i++;
        }
        usp usp = this.d;
        usp.b.block();
        String str = null;
        if (length != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("account NOT IN (");
            for (i = 0; i < length - 1; i++) {
                stringBuilder.append("?, ");
            }
            stringBuilder.append("?)");
            str = stringBuilder.toString();
        } else {
            strArr = null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = usp.a.getReadableDatabase().query("identity", utt.a, str, strArr, null, null, null, null);
        while (query.moveToNext()) {
            try {
                if (!query.isNull(0)) {
                    arrayList.add(usp.a(query));
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
            }
        }
        query.close();
        usp.a("identity", str, strArr);
        return arrayList;
    }

    public final synchronized void a(String str, String str2) {
        if (a() && str.equals(this.e.b())) {
            this.e = ust.a(this.e.a(), str2, this.e.c(), this.e.f());
            this.a.edit().putString(utl.ACCOUNT_NAME, str2).apply();
        }
        usp usp = this.d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str2);
        String[] strArr = new String[]{str};
        usp.b.close();
        usp.c.execute(new uss(usp, contentValues, strArr));
    }
}
