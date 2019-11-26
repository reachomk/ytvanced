package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: agfi */
public final class agfi {
    private static final avsi i = avsi.SD;
    public final List a = new ArrayList();
    public final agpi b;
    public final agio c;
    public final agfu d;
    public final agen e;
    public final ages f;
    public final ageq g;
    public final agif h;
    private final aghn j;
    private final agew k;
    private final aghw l;
    private final aghr m;
    private final agfn n;
    private final xsc o;

    public agfi(agpi agpi, aghn aghn, agew agew, agio agio, agfu agfu, aghw aghw, aghr aghr, agen agen, ages ages, ageq ageq, agfn agfn, agif agif, xsc xsc) {
        this.b = agpi;
        this.j = aghn;
        this.k = agew;
        this.c = agio;
        this.d = agfu;
        this.l = aghw;
        this.m = aghr;
        this.e = agen;
        this.f = ages;
        this.g = ageq;
        this.n = agfn;
        this.h = agif;
        this.o = xsc;
    }

    public final void a(StringBuilder stringBuilder, String str, String[] strArr) {
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 8);
        stringBuilder2.append("Table: ");
        stringBuilder2.append(str);
        String str2 = "\n";
        stringBuilder2.append(str2);
        stringBuilder.append(stringBuilder2.toString());
        Cursor query = f().query(str, strArr, null, null, null, null, null);
        try {
            DatabaseUtils.dumpCursor(query, stringBuilder);
            stringBuilder.append(str2);
        } finally {
            query.close();
        }
    }

    public final void a() {
        agif agif = this.h;
        agif.a.execute(new agii(agif));
    }

    public final agqp a(String str) {
        xvd.a(str);
        return this.c.d(str);
    }

    public final Pair b(String str) {
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            xvd.a(str);
            agqi e = this.d.e(str);
            if (e != null) {
                xvd.a(str);
                List c = this.d.c(str);
                if (c != null) {
                    f.setTransactionSuccessful();
                    Pair pair = new Pair(e, c);
                    return pair;
                }
                f.endTransaction();
                return null;
            }
            f.endTransaction();
            return null;
        } catch (SQLException unused) {
            return null;
        } finally {
            f.endTransaction();
        }
    }

    public final List b() {
        return this.d.b();
    }

    public final int c(String str) {
        xvd.a(str);
        agqk l = l(str);
        if (l == null) {
            return 0;
        }
        return l.d;
    }

    public final agpy d(String str) {
        xvd.a(str);
        return this.k.a(str);
    }

    public final avsi e(String str) {
        xvd.a(str);
        Cursor query = this.c.a.a().query("videosV2", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            int i;
            if (query.moveToNext()) {
                i = query.getInt(0);
            } else {
                query.close();
                i = -1;
            }
            avsi a = ahdl.a(i);
            return a == avsi.UNKNOWN_FORMAT_TYPE ? i : a;
        } finally {
            query.close();
        }
    }

    public final avsi f(String str) {
        xvd.a(str);
        avsi a = ahdl.a(this.d.f(str));
        return a == avsi.UNKNOWN_FORMAT_TYPE ? i : a;
    }

    public final int g(String str) {
        xvd.a(str);
        Cursor query = this.c.a.a().query("videosV2", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                int i = query.getInt(0);
                return i;
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final byte[] h(String str) {
        xvd.a(str);
        Cursor query = this.c.a.a().query("videosV2", new String[]{"player_response_tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                return blob;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final aakj i(String str) {
        xvd.a(str);
        agid c = this.h.c(str);
        return c != null ? c.b() : null;
    }

    public final agqy j(String str) {
        xvd.a(str);
        agid c = this.h.c(str);
        return c != null ? c.h() : null;
    }

    public final void k(String str) {
        if (this.h.c(str) != null) {
            this.h.c(str).a(a(str));
        }
    }

    public final List c() {
        return this.h.a();
    }

    public final List d() {
        ArrayList arrayList;
        agip e = this.h.e();
        synchronized (e.l) {
            arrayList = new ArrayList();
            for (agiu h : e.f) {
                arrayList.add(h.h());
            }
        }
        return arrayList;
    }

    public final agqk l(String str) {
        xvd.a(str);
        agib e = this.h.e(str);
        return e != null ? e.b() : null;
    }

    public final void m(String str) {
        agib e = this.h.e(str);
        if (e != null) {
            e.a(new agqi(e.a(), this.b.b(str, e.a().d)));
        }
    }

    public final Set n(String str) {
        xvd.a(str);
        return this.h.e().f(str);
    }

    public final List o(String str) {
        xvd.a(str);
        List a = this.m.b.a();
        Cursor query = a.query("subtitles_v5", aghr.a, "video_id = ?", new String[]{str}, null, null, null, null);
        try {
            aghu aghu = new aghu(query);
            a = new ArrayList(aghu.a.getCount());
            while (aghu.a.moveToNext()) {
                a.add(ajis.a(aghu.a.getString(aghu.c), aghu.a.getString(aghu.b), aghu.a.getString(aghu.d), aghu.a.getString(aghu.e), aghu.a.getString(aghu.f)));
            }
            return a;
        } finally {
            query.close();
        }
    }

    public final synchronized agqf p(String str) {
        xvd.a(str);
        try {
        } catch (SQLException e) {
            xtl.a("Error updating media status", e);
            return null;
        }
        return this.c.a(str);
    }

    public final boolean a(agpy agpy) {
        amqw.a((Object) agpy);
        try {
            agew agew = this.k;
            agew.a.a().insertOrThrow("channelsV13", null, agew.a(agpy));
            return true;
        } catch (SQLException e) {
            xtl.a("Error inserting channel", e);
            return false;
        }
    }

    public final boolean a(agqp agqp) {
        amqw.a((Object) agqp);
        try {
            this.c.a(agqp);
            agip e = this.h.e();
            synchronized (e.l) {
                amqw.a((Object) agqp);
                agiu agiu = (agiu) e.b.get(agqp.a());
                if (agiu != null) {
                    agiu.a(agqp);
                }
            }
            return true;
        } catch (SQLException e2) {
            xtl.a("Error updating single video", e2);
            return false;
        }
    }

    public final boolean q(String str) {
        xvd.a(str);
        try {
            agio agio = this.c;
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("player_response_proto");
            contentValues.putNull("refresh_token");
            contentValues.putNull("last_refresh_timestamp");
            contentValues.putNull("streams_timestamp");
            long update = (long) agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update == 1) {
                agip e = this.h.e();
                synchronized (e.l) {
                    xvd.a(str);
                    agiu agiu = (agiu) e.b.get(str);
                    if (agiu != null) {
                        agiu.j();
                    }
                }
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("Update video affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        } catch (SQLException e2) {
            xtl.a("Error updating single video", e2);
            return false;
        }
    }

    public final synchronized List r(String str) {
        List arrayList;
        xvd.a(str);
        arrayList = new ArrayList();
        List a = this.d.a.a();
        String[] strArr = new String[1];
        int i = 0;
        strArr[0] = str;
        Cursor rawQuery = a.rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id = ? ORDER BY index_in_playlist ASC", strArr);
        try {
            a = new ArrayList();
            while (rawQuery.moveToNext()) {
                a.add(rawQuery.getString(0));
            }
            int size = a.size();
            while (i < size) {
                String str2 = (String) a.get(i);
                agqy j = j(str2);
                if (j != null) {
                    if (j.o()) {
                        a(str2, agqf.ACTIVE);
                        arrayList.add(str2);
                    }
                }
                i++;
            }
        } finally {
            rawQuery.close();
        }
        return arrayList;
    }

    public final synchronized boolean s(String str) {
        boolean z;
        xvd.a(str);
        agid c = this.h.c(str);
        if (!(c == null || this.h.e().e(str) || c.e() == agqf.DELETED)) {
            try {
                this.d.i(str);
                this.h.h(str);
                z = true;
            } catch (SQLException e) {
                xtl.a("Error inserting existing video as single video", e);
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean a(String str, aakj aakj, long j, boolean z, aajx aajx) {
        amqw.a((Object) aakj);
        agid c = this.h.c(str);
        if (c != null) {
            try {
                aakj = aakj.b(aajx);
                this.c.a(aakj);
                this.c.a(str, aakj, !z ? c.c() : j, j);
                c.a(aakj, j, j);
                for (agfh a : this.a) {
                    a.a(aakj);
                }
                return true;
            } catch (aocg e) {
                xtl.a("Error updating player response for offline", e);
            } catch (SQLException e2) {
                xtl.a("Error inserting player response", e2);
            }
        }
        return false;
    }

    public final synchronized boolean a(String str, aafv aafv) {
        xvd.a(str);
        amqw.a((Object) aafv);
        try {
            agio agio = this.c;
            ContentValues contentValues = new ContentValues();
            contentValues.put("watch_next_proto", aocf.toByteArray(aafv.a));
            int update = agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (update != 1) {
                StringBuilder stringBuilder = new StringBuilder(49);
                stringBuilder.append("Update video watch next affected ");
                stringBuilder.append(update);
                stringBuilder.append(" rows");
                throw new SQLException(stringBuilder.toString());
            }
        } catch (SQLException e) {
            xtl.a("Error inserting watch next response", e);
            return false;
        }
        return true;
    }

    public final synchronized boolean a(String str, agqz agqz) {
        boolean z;
        xvd.a(str);
        amqw.a((Object) agqz);
        agid c = this.h.c(str);
        if (c != null) {
            c.a(agqz);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean a(String str, agqf agqf) {
        boolean z;
        xvd.a(str);
        amqw.a((Object) agqf);
        agid c = this.h.c(str);
        if (!(c == null || c.e() == agqf)) {
            try {
                this.c.a(str, agqf);
                c.a(agqf);
                agip e = this.h.e();
                synchronized (e.l) {
                    for (String c2 : e.f(str)) {
                        agib c3 = e.c(c2);
                        if (c3 != null) {
                            c3.c();
                        }
                    }
                }
                z = true;
            } catch (SQLException e2) {
                xtl.a("Error updating media status", e2);
            }
        }
        z = false;
        return z;
    }

    public final boolean a(String str, agqq agqq) {
        xvd.a(str);
        amqw.a((Object) agqq);
        agid c = this.h.c(str);
        if (!(c == null || c.f() == agqq)) {
            try {
                agio agio = this.c;
                ContentValues contentValues = new ContentValues();
                contentValues.put("stream_transfer_condition", Integer.valueOf(agqq.c));
                long update = (long) agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (update == 1) {
                    c.a(agqq);
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder(73);
                stringBuilder.append("Update video stream transfer condition affected ");
                stringBuilder.append(update);
                stringBuilder.append(" rows");
                throw new SQLException(stringBuilder.toString());
            } catch (SQLException e) {
                xtl.a("Error updating stream transfer condition", e);
            }
        }
        return false;
    }

    public final agqn a(String str, agho agho) {
        xvd.a(str);
        agie a = this.h.a(str);
        return a != null ? a.a(agho) : null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0027 */
    public final synchronized boolean a(defpackage.agql r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        defpackage.amqw.a(r5);	 Catch:{ all -> 0x0032 }
        r0 = r4.j;	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r1 = r0.a(r5);	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r0 = r0.c;	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r0 = r0.a();	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r2 = "streams";
        r3 = 0;
        r0.insertOrThrow(r2, r3, r1);	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r0 = r4.h;	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r0.a(r5);	 Catch:{ SQLiteConstraintException -> 0x0027, SQLException -> 0x001e }
        r5 = 1;
        monitor-exit(r4);
        return r5;
    L_0x001e:
        r5 = move-exception;
        r0 = "Error inserting stream";
        defpackage.xtl.a(r0, r5);	 Catch:{ all -> 0x0032 }
        r5 = 0;
        monitor-exit(r4);
        return r5;
    L_0x0027:
        r0 = "Failed insert due to constraint failure, attempting update";
        defpackage.xtl.c(r0);	 Catch:{ all -> 0x0032 }
        r5 = r4.b(r5);	 Catch:{ all -> 0x0032 }
        monitor-exit(r4);
        return r5;
    L_0x0032:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.a(agql):boolean");
    }

    public final synchronized boolean a(String str, int i, long j) {
        xvd.a(str);
        agie a = this.h.a(str);
        if (a != null) {
            agql a2 = a.a(i);
            if (a2 != null && j >= a2.c()) {
                return b(a2.y().a(j).a());
            }
        }
        return false;
    }

    public final synchronized boolean a(String str, int i, int i2) {
        xvd.a(str);
        agie a = this.h.a(str);
        if (a != null) {
            agql a2 = a.a(i);
            if (a2 != null) {
                return b(a2.y().a(i2).b(this.o.a()).a());
            }
        }
        return false;
    }

    public final synchronized boolean a(String str, int i, String str2) {
        xvd.a(str);
        agie a = this.h.a(str);
        if (a != null) {
            agql a2 = a.a(i);
            if (a2 != null) {
                return b(a2.y().b(str2).a());
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:25:0x004a, code skipped:
            return false;
     */
    public final synchronized boolean a(java.lang.String r6, int r7, long r8, long r10) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = 1;
        r1 = 0;
        r2 = 0;
        r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x000b;
    L_0x0009:
        r4 = 1;
        goto L_0x000c;
    L_0x000b:
        r4 = 0;
    L_0x000c:
        defpackage.amqw.a(r4);	 Catch:{ all -> 0x004b }
        r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        defpackage.amqw.a(r0);	 Catch:{ all -> 0x004b }
        defpackage.xvd.a(r6);	 Catch:{ all -> 0x004b }
        r0 = r5.h;	 Catch:{ all -> 0x004b }
        r6 = r0.a(r6);	 Catch:{ all -> 0x004b }
        if (r6 == 0) goto L_0x0049;
    L_0x0023:
        r7 = r6.a(r7);	 Catch:{ all -> 0x004b }
        if (r7 == 0) goto L_0x0049;
    L_0x0029:
        r7 = r7.y();	 Catch:{ all -> 0x004b }
        r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0035;
    L_0x0032:
        r7.c(r8);	 Catch:{ all -> 0x004b }
    L_0x0035:
        r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x003c;
    L_0x0039:
        r7.d(r10);	 Catch:{ all -> 0x004b }
    L_0x003c:
        r6.a(r8, r10);	 Catch:{ all -> 0x004b }
        r6 = r7.a();	 Catch:{ all -> 0x004b }
        r6 = r5.b(r6);	 Catch:{ all -> 0x004b }
        monitor-exit(r5);
        return r6;
    L_0x0049:
        monitor-exit(r5);
        return r1;
    L_0x004b:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.a(java.lang.String, int, long, long):boolean");
    }

    /* JADX WARNING: Missing block: B:15:0x006a, code skipped:
            if (r4 != 0) goto L_0x006c;
     */
    public final synchronized boolean b(defpackage.agql r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = 0;
        r1 = r8.j;	 Catch:{ SQLException -> 0x009d }
        r2 = r1.a(r9);	 Catch:{ SQLException -> 0x009d }
        r1 = r1.c;	 Catch:{ SQLException -> 0x009d }
        r1 = r1.a();	 Catch:{ SQLException -> 0x009d }
        r3 = "streams";
        r4 = "video_id = ? AND itag = ?";
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLException -> 0x009d }
        r6 = r9.q();	 Catch:{ SQLException -> 0x009d }
        r5[r0] = r6;	 Catch:{ SQLException -> 0x009d }
        r6 = r9.r();	 Catch:{ SQLException -> 0x009d }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ SQLException -> 0x009d }
        r7 = 1;
        r5[r7] = r6;	 Catch:{ SQLException -> 0x009d }
        r1 = r1.update(r3, r2, r4, r5);	 Catch:{ SQLException -> 0x009d }
        r1 = (long) r1;	 Catch:{ SQLException -> 0x009d }
        r3 = 1;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x007d;
    L_0x0031:
        r1 = r8.h;	 Catch:{ SQLException -> 0x009d }
        r2 = r1.e();	 Catch:{ SQLException -> 0x009d }
        r3 = r9.q();	 Catch:{ SQLException -> 0x009d }
        r2 = r2.a(r3);	 Catch:{ SQLException -> 0x009d }
        if (r2 != 0) goto L_0x004a;
    L_0x0041:
        r2 = "Stream to be updated was missing from cache. Inserting instead.";
        defpackage.xtl.d(r2);	 Catch:{ SQLException -> 0x009d }
        r1.a(r9);	 Catch:{ SQLException -> 0x009d }
        goto L_0x007b;
    L_0x004a:
        r3 = r9.p();	 Catch:{ SQLException -> 0x009d }
        r3 = defpackage.agmn.a(r3);	 Catch:{ SQLException -> 0x009d }
        if (r3 == 0) goto L_0x0071;
    L_0x0054:
        r3 = r2.e();	 Catch:{ SQLException -> 0x009d }
        r4 = r3.f;	 Catch:{ SQLException -> 0x009d }
        r4 = r4 ^ r7;
        r5 = r9.o();	 Catch:{ SQLException -> 0x009d }
        r3 = r3.e;	 Catch:{ SQLException -> 0x009d }
        if (r5 == 0) goto L_0x006a;
    L_0x0063:
        r3 = r5.equals(r3);	 Catch:{ SQLException -> 0x009d }
        if (r3 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006c;
    L_0x006a:
        if (r4 == 0) goto L_0x0071;
    L_0x006c:
        r3 = r1.f;	 Catch:{ SQLException -> 0x009d }
        r3.a(r5);	 Catch:{ SQLException -> 0x009d }
    L_0x0071:
        r2.a(r9);	 Catch:{ SQLException -> 0x009d }
        r1 = r1.e();	 Catch:{ SQLException -> 0x009d }
        r1.a(r9);	 Catch:{ SQLException -> 0x009d }
    L_0x007b:
        monitor-exit(r8);
        return r7;
    L_0x007d:
        r9 = new android.database.SQLException;	 Catch:{ SQLException -> 0x009d }
        r3 = new java.lang.StringBuilder;	 Catch:{ SQLException -> 0x009d }
        r4 = 66;
        r3.<init>(r4);	 Catch:{ SQLException -> 0x009d }
        r4 = "Update stream bytes_transferred affected ";
        r3.append(r4);	 Catch:{ SQLException -> 0x009d }
        r3.append(r1);	 Catch:{ SQLException -> 0x009d }
        r1 = " rows";
        r3.append(r1);	 Catch:{ SQLException -> 0x009d }
        r1 = r3.toString();	 Catch:{ SQLException -> 0x009d }
        r9.<init>(r1);	 Catch:{ SQLException -> 0x009d }
        throw r9;	 Catch:{ SQLException -> 0x009d }
    L_0x009b:
        r9 = move-exception;
        goto L_0x00a5;
    L_0x009d:
        r9 = move-exception;
        r1 = "Error updating stream";
        defpackage.xtl.a(r1, r9);	 Catch:{ all -> 0x009b }
        monitor-exit(r8);
        return r0;
    L_0x00a5:
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.b(agql):boolean");
    }

    /* JADX WARNING: Missing block: B:14:0x005e, code skipped:
            return true;
     */
    public final synchronized boolean a(java.lang.String r11, int r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        defpackage.xvd.a(r11);	 Catch:{ all -> 0x0087 }
        r0 = r10.h;	 Catch:{ all -> 0x0087 }
        r0 = r0.a(r11);	 Catch:{ all -> 0x0087 }
        r1 = 0;
        if (r0 == 0) goto L_0x0085;
    L_0x000d:
        r2 = r10.j;	 Catch:{ SQLException -> 0x007d }
        r3 = r2.c;	 Catch:{ SQLException -> 0x007d }
        r3 = r3.a();	 Catch:{ SQLException -> 0x007d }
        r4 = "streams";
        r5 = "video_id = ? AND itag = ?";
        r6 = 2;
        r7 = new java.lang.String[r6];	 Catch:{ SQLException -> 0x007d }
        r7[r1] = r11;	 Catch:{ SQLException -> 0x007d }
        r8 = java.lang.Integer.toString(r12);	 Catch:{ SQLException -> 0x007d }
        r9 = 1;
        r7[r9] = r8;	 Catch:{ SQLException -> 0x007d }
        r3 = r3.delete(r4, r5, r7);	 Catch:{ SQLException -> 0x007d }
        r3 = (long) r3;	 Catch:{ SQLException -> 0x007d }
        r7 = 1;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 != 0) goto L_0x005f;
    L_0x0030:
        r2 = r2.d;	 Catch:{ SQLException -> 0x007d }
        r2 = r2.b;	 Catch:{ SQLException -> 0x007d }
        r2 = r2.a();	 Catch:{ SQLException -> 0x007d }
        r3 = "hashes";
        r4 = "video_id = ? AND itag = ?";
        r5 = new java.lang.String[r6];	 Catch:{ SQLException -> 0x007d }
        r5[r1] = r11;	 Catch:{ SQLException -> 0x007d }
        r6 = java.lang.String.valueOf(r12);	 Catch:{ SQLException -> 0x007d }
        r5[r9] = r6;	 Catch:{ SQLException -> 0x007d }
        r2.delete(r3, r4, r5);	 Catch:{ SQLException -> 0x007d }
        r0.b(r12);	 Catch:{ SQLException -> 0x007d }
        r12 = r0.a();	 Catch:{ SQLException -> 0x007d }
        if (r12 != 0) goto L_0x005d;
    L_0x0052:
        r12 = r0.b();	 Catch:{ SQLException -> 0x007d }
        if (r12 != 0) goto L_0x005d;
    L_0x0058:
        r12 = r10.h;	 Catch:{ SQLException -> 0x007d }
        r12.b(r11);	 Catch:{ SQLException -> 0x007d }
    L_0x005d:
        monitor-exit(r10);
        return r9;
    L_0x005f:
        r11 = new android.database.SQLException;	 Catch:{ SQLException -> 0x007d }
        r12 = new java.lang.StringBuilder;	 Catch:{ SQLException -> 0x007d }
        r0 = 48;
        r12.<init>(r0);	 Catch:{ SQLException -> 0x007d }
        r0 = "Delete stream affected ";
        r12.append(r0);	 Catch:{ SQLException -> 0x007d }
        r12.append(r3);	 Catch:{ SQLException -> 0x007d }
        r0 = " rows";
        r12.append(r0);	 Catch:{ SQLException -> 0x007d }
        r12 = r12.toString();	 Catch:{ SQLException -> 0x007d }
        r11.<init>(r12);	 Catch:{ SQLException -> 0x007d }
        throw r11;	 Catch:{ SQLException -> 0x007d }
    L_0x007d:
        r11 = move-exception;
        r12 = "Error deleting stream";
        defpackage.xtl.a(r12, r11);	 Catch:{ all -> 0x0087 }
        monitor-exit(r10);
        return r1;
    L_0x0085:
        monitor-exit(r10);
        return r1;
    L_0x0087:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.a(java.lang.String, int):boolean");
    }

    public final synchronized void a(String str, boolean z) {
        xvd.a(str);
        try {
            this.j.a(str, z);
            this.h.b(str);
        } catch (SQLException e) {
            xtl.a("Error deleting streams", e);
        }
    }

    public final synchronized boolean a(String str, long j) {
        xvd.a(str);
        agid c = this.h.c(str);
        if (c != null) {
            try {
                agio agio = this.c;
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_playback_timestamp", Long.valueOf(j));
                long update = (long) agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (update == 1) {
                    c.a(j);
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder(71);
                stringBuilder.append("Update video last_playback_timestamp affected ");
                stringBuilder.append(update);
                stringBuilder.append(" rows");
                throw new SQLException(stringBuilder.toString());
            } catch (SQLException e) {
                xtl.a("Error updating last playback timestamp", e);
                return false;
            }
        }
    }

    public final synchronized boolean b(String str, long j) {
        xvd.a(str);
        agid c = this.h.c(str);
        if (c != null) {
            try {
                agio agio = this.c;
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_playback_position_timestamp", Long.valueOf(j));
                long update = (long) agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (update == 1) {
                    c.b(j);
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder(81);
                stringBuilder.append("Update video last_playback_position_in_seconds affected ");
                stringBuilder.append(update);
                stringBuilder.append(" rows");
                throw new SQLException(stringBuilder.toString());
            } catch (SQLException e) {
                xtl.a("Error updating last playback position timestamp", e);
                return false;
            }
        }
    }

    public final boolean c(String str, long j) {
        xvd.a(str);
        agid c = this.h.c(str);
        if (c != null) {
            try {
                this.c.a(str, j);
                c.c(j);
                return true;
            } catch (SQLException e) {
                xtl.a("Error updating video added timestamp", e);
            }
        }
        return false;
    }

    public final boolean b(agpy agpy) {
        amqw.a((Object) agpy);
        try {
            agew agew = this.k;
            long update = (long) agew.a.a().update("channelsV13", agew.a(agpy), "id = ?", new String[]{agpy.a});
            if (update == 1) {
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("Update channel affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        } catch (SQLException e) {
            xtl.a("Error updating channel", e);
            return false;
        }
    }

    public final synchronized boolean b(String str, int i) {
        xvd.a(str);
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            aghw aghw = this.l;
            String a = agqr.a(avmy.OFFLINE_CANDIDATE_TYPE_LITE_HOMEPAGE);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 2);
            stringBuilder.append("'");
            stringBuilder.append(a);
            stringBuilder.append("'");
            a = stringBuilder.toString();
            String a2 = agqr.a(avmy.OFFLINE_CANDIDATE_TYPE_LITE_NOTIFICATION);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a2).length() + 2);
            stringBuilder2.append("'");
            stringBuilder2.append(a2);
            stringBuilder2.append("'");
            a2 = stringBuilder2.toString();
            String a3 = agqr.a(avmy.OFFLINE_CANDIDATE_TYPE_LITE_SOCIAL);
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(a3).length() + 2);
            stringBuilder3.append("'");
            stringBuilder3.append(a3);
            stringBuilder3.append("'");
            a3 = stringBuilder3.toString();
            String a4 = agqr.a(avmy.OFFLINE_CANDIDATE_TYPE_LITE_SUBSCRIPTION);
            StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(a4).length() + 2);
            stringBuilder4.append("'");
            stringBuilder4.append(a4);
            stringBuilder4.append("'");
            a = TextUtils.join(", ", amul.a(a, a2, a3, stringBuilder4.toString()));
            stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 36);
            stringBuilder2.append("video_list_id IN (");
            stringBuilder2.append(a);
            stringBuilder2.append(") AND video_id = ?");
            long a5 = xbs.a(aghw.a.a(), "video_list_videos", stringBuilder2.toString(), new String[]{str});
            agqp d = this.c.d(str);
            if (d != null) {
                if (i != 1) {
                    agqf agqf;
                    this.d.j(str);
                    if (a5 <= 0) {
                        b(d);
                    }
                    if (this.d.a(str)) {
                        agqf = agqf.DELETED;
                    } else if (a5 > 0) {
                        agqf = agqf.METADATA_ONLY;
                    } else {
                        agqf = null;
                    }
                    if (agqf != null) {
                        agio agio = this.c;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("media_status", Integer.valueOf(agqf.p));
                        contentValues.putNull("player_response_proto");
                        contentValues.putNull("refresh_token");
                        contentValues.putNull("saved_timestamp");
                        contentValues.putNull("streams_timestamp");
                        contentValues.putNull("last_refresh_timestamp");
                        contentValues.putNull("last_playback_timestamp");
                        contentValues.putNull("video_added_timestamp");
                        long update = (long) agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str});
                        if (update != 1) {
                            StringBuilder stringBuilder5 = new StringBuilder(73);
                            stringBuilder5.append("Update video offline_playability_state affected ");
                            stringBuilder5.append(update);
                            stringBuilder5.append(" rows");
                            throw new SQLException(stringBuilder5.toString());
                        }
                    } else {
                        c(d);
                    }
                } else {
                    c(d);
                }
            }
            xvd.a(str);
            if (this.f.a(str) <= 0) {
                a(str, false);
            }
            if (!this.d.b(str)) {
                if (a5 <= 0) {
                    this.h.d(str);
                } else {
                    agip e = this.h.e();
                    synchronized (e.l) {
                        amqw.a((Object) str);
                        synchronized (e.l) {
                            xvd.a(str);
                            e.e.remove(str);
                            agiu agiu = (agiu) e.b.get(str);
                            if (agiu != null) {
                                agiu.i();
                                e.f.b(agiu);
                            }
                        }
                        agiu agiu2 = (agiu) e.b.get(str);
                        if (agiu2 != null) {
                            agiu2.a(agqf.METADATA_ONLY);
                        }
                    }
                }
            }
            if (this.h.a().isEmpty()) {
                for (agfh a6 : this.a) {
                    a6.a();
                }
            }
            f.setTransactionSuccessful();
            f.endTransaction();
        } catch (SQLException e2) {
            try {
                xtl.a("Error deleting video", e2);
            } finally {
                f.endTransaction();
            }
            return false;
        }
        return true;
    }

    public final synchronized boolean t(String str) {
        xvd.a(str);
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            agfu agfu = this.d;
            agqi e = agfu.e(str);
            long delete = (long) agfu.a.a().delete("playlistsV13", "id = ?", new String[]{str});
            if (delete == 1) {
                for (agft a : agfu.d) {
                    a.a(e);
                }
                Collection c = agfu.c(e.a);
                agfu.a.a().delete("playlist_video", "playlist_id = ?", new String[]{str});
                for (agft a2 : agfu.d) {
                    a2.a(c);
                }
                f.setTransactionSuccessful();
                f.endTransaction();
            } else {
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Delete playlist affected ");
                stringBuilder.append(delete);
                stringBuilder.append(" rows");
                throw new SQLException(stringBuilder.toString());
            }
        } catch (SQLException e2) {
            try {
                xtl.a("Error deleting playlist", e2);
            } finally {
                f.endTransaction();
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e A:{Catch:{ all -> 0x0150, all -> 0x014b }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d A:{LOOP_END, Catch:{ all -> 0x0150, all -> 0x014b }, LOOP:7: B:40:0x0127->B:42:0x012d} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0144 A:{Catch:{ all -> 0x0150, all -> 0x014b }} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0143 A:{Catch:{ all -> 0x0150, all -> 0x014b }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e A:{Catch:{ all -> 0x0150, all -> 0x014b }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012d A:{LOOP_END, Catch:{ all -> 0x0150, all -> 0x014b }, LOOP:7: B:40:0x0127->B:42:0x012d} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0143 A:{Catch:{ all -> 0x0150, all -> 0x014b }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0144 A:{Catch:{ all -> 0x0150, all -> 0x014b }} */
    private final synchronized void b(defpackage.agqp r26) {
        /*
        r25 = this;
        r1 = r25;
        monitor-enter(r25);
        r0 = r26;
        r2 = r0.c;	 Catch:{ all -> 0x015d }
        if (r2 != 0) goto L_0x015b;
    L_0x0009:
        r2 = r1.h;	 Catch:{ all -> 0x015d }
        r3 = r26.a();	 Catch:{ all -> 0x015d }
        r2 = r2.i(r3);	 Catch:{ all -> 0x015d }
        r2 = r2.iterator();	 Catch:{ all -> 0x015d }
    L_0x0017:
        r3 = r2.hasNext();	 Catch:{ all -> 0x015d }
        if (r3 == 0) goto L_0x0159;
    L_0x001d:
        r3 = r2.next();	 Catch:{ all -> 0x015d }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x015d }
        r4 = r1.l;	 Catch:{ all -> 0x015d }
        r4 = r4.a(r3);	 Catch:{ all -> 0x015d }
        r5 = r4.iterator();	 Catch:{ all -> 0x015d }
        r6 = 0;
        r7 = 1;
        r8 = 0;
    L_0x0030:
        r9 = r5.hasNext();	 Catch:{ all -> 0x015d }
        if (r9 == 0) goto L_0x004f;
    L_0x0036:
        r9 = r5.next();	 Catch:{ all -> 0x015d }
        r9 = (defpackage.agqp) r9;	 Catch:{ all -> 0x015d }
        r9 = r9.a();	 Catch:{ all -> 0x015d }
        r10 = r26.a();	 Catch:{ all -> 0x015d }
        r9 = r9.equals(r10);	 Catch:{ all -> 0x015d }
        if (r9 == 0) goto L_0x0030;
    L_0x004a:
        r5.remove();	 Catch:{ all -> 0x015d }
        r8 = 1;
        goto L_0x0030;
    L_0x004f:
        if (r8 == 0) goto L_0x0155;
    L_0x0051:
        r5 = r1.l;	 Catch:{ all -> 0x015d }
        r5 = r5.a;	 Catch:{ all -> 0x015d }
        r8 = r5.a();	 Catch:{ all -> 0x015d }
        r10 = defpackage.aghv.a;	 Catch:{ all -> 0x015d }
        r12 = new java.lang.String[r7];	 Catch:{ all -> 0x015d }
        r12[r6] = r3;	 Catch:{ all -> 0x015d }
        r9 = "final_video_list_video_ids";
        r11 = "video_list_id = ?";
        r13 = 0;
        r14 = 0;
        r15 = "index_in_video_list ASC";
        r16 = 0;
        r5 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x015d }
        r13 = new java.util.ArrayList;	 Catch:{ all -> 0x0150 }
        r8 = r5.getCount();	 Catch:{ all -> 0x0150 }
        r13.<init>(r8);	 Catch:{ all -> 0x0150 }
    L_0x0076:
        r8 = r5.moveToNext();	 Catch:{ all -> 0x0150 }
        if (r8 == 0) goto L_0x008a;
    L_0x007c:
        r8 = "video_id";
        r8 = r5.getColumnIndexOrThrow(r8);	 Catch:{ all -> 0x0150 }
        r8 = r5.getString(r8);	 Catch:{ all -> 0x0150 }
        r13.add(r8);	 Catch:{ all -> 0x0150 }
        goto L_0x0076;
    L_0x008a:
        r5.close();	 Catch:{ all -> 0x015d }
        r5 = r1.l;	 Catch:{ all -> 0x015d }
        r5 = r5.b(r3);	 Catch:{ all -> 0x015d }
        r14 = r5.c;	 Catch:{ all -> 0x015d }
        r15 = new agqr;	 Catch:{ all -> 0x015d }
        r8 = r4.size();	 Catch:{ all -> 0x015d }
        r15.<init>(r5, r8);	 Catch:{ all -> 0x015d }
        r5 = r1.l;	 Catch:{ all -> 0x015d }
        r5.a(r15);	 Catch:{ all -> 0x015d }
        r5 = r1.l;	 Catch:{ all -> 0x015d }
        r12 = 2;
        if (r14 == r12) goto L_0x00ab;
    L_0x00a8:
        r8 = defpackage.agqf.ACTIVE;	 Catch:{ all -> 0x015d }
        goto L_0x00ad;
    L_0x00ab:
        r8 = defpackage.agqf.METADATA_ONLY;	 Catch:{ all -> 0x015d }
    L_0x00ad:
        r9 = r1.l;	 Catch:{ all -> 0x015d }
        r9 = r9.d(r3);	 Catch:{ all -> 0x015d }
        r10 = r1.l;	 Catch:{ all -> 0x015d }
        r10 = r10.a;	 Catch:{ all -> 0x015d }
        r16 = r10.a();	 Catch:{ all -> 0x015d }
        r10 = new java.lang.String[r7];	 Catch:{ all -> 0x015d }
        r11 = "offline_audio_quality";
        r10[r6] = r11;	 Catch:{ all -> 0x015d }
        r11 = new java.lang.String[r7];	 Catch:{ all -> 0x015d }
        r11[r6] = r3;	 Catch:{ all -> 0x015d }
        r17 = "video_listsV13";
        r19 = "id = ?";
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r18 = r10;
        r20 = r11;
        r10 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x015d }
        r11 = r10.moveToNext();	 Catch:{ all -> 0x014b }
        if (r11 == 0) goto L_0x00f0;
    L_0x00df:
        r6 = r10.getInt(r6);	 Catch:{ all -> 0x014b }
        r6 = defpackage.avmm.a(r6);	 Catch:{ all -> 0x014b }
        if (r6 == 0) goto L_0x00ea;
    L_0x00e9:
        goto L_0x00eb;
    L_0x00ea:
        r6 = 1;
    L_0x00eb:
        r10.close();	 Catch:{ all -> 0x015d }
        r10 = r6;
        goto L_0x00f4;
    L_0x00f0:
        r10.close();	 Catch:{ all -> 0x015d }
        r10 = 1;
    L_0x00f4:
        r6 = r1.l;	 Catch:{ all -> 0x015d }
        r11 = r6.e(r3);	 Catch:{ all -> 0x015d }
        r6 = r1.l;	 Catch:{ all -> 0x015d }
        r16 = r6.f(r3);	 Catch:{ all -> 0x015d }
        r6 = r15;
        r7 = r4;
        r0 = 2;
        r12 = r16;
        r5.a(r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x015d }
        r5 = r13.isEmpty();	 Catch:{ all -> 0x015d }
        if (r5 != 0) goto L_0x011e;
    L_0x010e:
        r5 = r26.a();	 Catch:{ all -> 0x015d }
        r5 = java.util.Collections.singleton(r5);	 Catch:{ all -> 0x015d }
        r13.removeAll(r5);	 Catch:{ all -> 0x015d }
        r5 = r1.l;	 Catch:{ all -> 0x015d }
        r5.a(r15, r13);	 Catch:{ all -> 0x015d }
    L_0x011e:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x015d }
        r5.<init>();	 Catch:{ all -> 0x015d }
        r4 = r4.iterator();	 Catch:{ all -> 0x015d }
    L_0x0127:
        r6 = r4.hasNext();	 Catch:{ all -> 0x015d }
        if (r6 == 0) goto L_0x013b;
    L_0x012d:
        r6 = r4.next();	 Catch:{ all -> 0x015d }
        r6 = (defpackage.agqp) r6;	 Catch:{ all -> 0x015d }
        r6 = r6.a();	 Catch:{ all -> 0x015d }
        r5.add(r6);	 Catch:{ all -> 0x015d }
        goto L_0x0127;
    L_0x013b:
        r4 = r1.l;	 Catch:{ all -> 0x015d }
        r3 = r4.g(r3);	 Catch:{ all -> 0x015d }
        if (r14 == r0) goto L_0x0144;
    L_0x0143:
        goto L_0x0145;
    L_0x0144:
        r13 = 0;
    L_0x0145:
        r0 = r1.h;	 Catch:{ all -> 0x015d }
        r0.a(r15, r5, r13, r3);	 Catch:{ all -> 0x015d }
        goto L_0x0155;
    L_0x014b:
        r0 = move-exception;
        r10.close();	 Catch:{ all -> 0x015d }
        throw r0;	 Catch:{ all -> 0x015d }
    L_0x0150:
        r0 = move-exception;
        r5.close();	 Catch:{ all -> 0x015d }
        throw r0;	 Catch:{ all -> 0x015d }
    L_0x0155:
        r0 = r26;
        goto L_0x0017;
    L_0x0159:
        monitor-exit(r25);
        return;
    L_0x015b:
        monitor-exit(r25);
        return;
    L_0x015d:
        r0 = move-exception;
        monitor-exit(r25);
        goto L_0x0161;
    L_0x0160:
        throw r0;
    L_0x0161:
        goto L_0x0160;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.b(agqp):void");
    }

    /* JADX WARNING: Missing block: B:8:0x002a, code skipped:
            return;
     */
    private final synchronized void c(defpackage.agqp r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r3.c;	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x002b;
    L_0x0005:
        r0 = r2.d;	 Catch:{ all -> 0x002d }
        r1 = r3.a();	 Catch:{ all -> 0x002d }
        r0.j(r1);	 Catch:{ all -> 0x002d }
        r2.b(r3);	 Catch:{ all -> 0x002d }
        r0 = r2.c;	 Catch:{ all -> 0x002d }
        r1 = r3.a();	 Catch:{ all -> 0x002d }
        r0 = r0.c(r1);	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x0029;
    L_0x001d:
        r0 = r3.a();	 Catch:{ all -> 0x002d }
        r2.A(r0);	 Catch:{ all -> 0x002d }
        r0 = r2.c;	 Catch:{ all -> 0x002d }
        r0.b(r3);	 Catch:{ all -> 0x002d }
    L_0x0029:
        monitor-exit(r2);
        return;
    L_0x002b:
        monitor-exit(r2);
        return;
    L_0x002d:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.c(agqp):void");
    }

    public final synchronized boolean a(String str, agqf agqf, avsi avsi, int i, byte[] bArr) {
        String str2 = str;
        synchronized (this) {
            xvd.a(str);
            amqw.a((Object) agqf);
            if (this.h.c(str) == null) {
                agqp a = a(str);
                if (a != null) {
                    try {
                        agqf agqf2 = agqf;
                        this.c.a(str, agqf);
                        agio agio = this.c;
                        int a2 = ahdl.a(avsi, 360);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("preferred_stream_quality", Integer.valueOf(a2));
                        long update = (long) agio.a.a().update("videosV2", contentValues, "id = ?", new String[]{str2});
                        if (update == 1) {
                            update = this.c.e(str);
                            if (update == 0) {
                                update = this.o.a();
                                this.c.a(str, update);
                            }
                            long j = update;
                            this.h.a(a, avsi, i, bArr, agqf, agqq.OFFLINE_IMMEDIATELY, j);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder(72);
                            stringBuilder.append("Update video preferred_stream_quality affected ");
                            stringBuilder.append(update);
                            stringBuilder.append(" rows");
                            throw new SQLException(stringBuilder.toString());
                        }
                    } catch (SQLException e) {
                        xtl.a("Error undeleting video", e);
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(ajis ajis) {
        amqw.a((Object) ajis);
        try {
            amqw.a((Object) ajis);
            xvd.a(ajis.g);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_id", ajis.d);
            contentValues.put("language_code", ajis.a);
            contentValues.put("subtitles_path", ajis.g);
            contentValues.put("track_vss_id", ajis.h);
            contentValues.put("user_visible_track_name", ajis.toString());
            if (this.m.b.a().insert("subtitles_v5", null, contentValues) != -1) {
                return true;
            }
            throw new SQLException("Error inserting subtitle track");
        } catch (SQLException e) {
            xtl.a("Error inserting subtitle tracks", e);
            return false;
        }
    }

    private final boolean A(String str) {
        amqw.a((Object) str);
        try {
            this.m.a(str);
            return true;
        } catch (SQLException e) {
            xtl.a("Error deleting subtitle tracks", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b A:{Catch:{ all -> 0x0072 }} */
    public final synchronized void u(java.lang.String r24) {
        /*
        r23 = this;
        r1 = r23;
        r0 = r24;
        monitor-enter(r23);
        defpackage.xvd.a(r24);	 Catch:{ all -> 0x0079 }
        r2 = r1.h;	 Catch:{ all -> 0x0079 }
        r9 = r2.c(r0);	 Catch:{ all -> 0x0079 }
        if (r9 == 0) goto L_0x0077;
    L_0x0010:
        r10 = r9.c();	 Catch:{ all -> 0x0079 }
        r12 = r9.d();	 Catch:{ all -> 0x0079 }
        r2 = r1.c;	 Catch:{ all -> 0x0079 }
        r2 = r2.a;	 Catch:{ all -> 0x0079 }
        r14 = r2.a();	 Catch:{ all -> 0x0079 }
        r2 = 1;
        r3 = new java.lang.String[r2];	 Catch:{ all -> 0x0079 }
        r4 = "player_response_proto";
        r5 = 0;
        r3[r5] = r4;	 Catch:{ all -> 0x0079 }
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x0079 }
        r2[r5] = r0;	 Catch:{ all -> 0x0079 }
        r15 = "videosV2";
        r17 = "id = ?";
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r16 = r3;
        r18 = r2;
        r2 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22);	 Catch:{ all -> 0x0079 }
        r3 = r2.moveToNext();	 Catch:{ all -> 0x0072 }
        if (r3 == 0) goto L_0x0054;
    L_0x0046:
        r3 = new agiv;	 Catch:{ all -> 0x0072 }
        r3.<init>(r2);	 Catch:{ all -> 0x0072 }
        r3 = r3.a();	 Catch:{ all -> 0x0072 }
        r2.close();	 Catch:{ all -> 0x0079 }
        r14 = r3;
        goto L_0x0059;
    L_0x0054:
        r2.close();	 Catch:{ all -> 0x0079 }
        r2 = 0;
        r14 = r2;
    L_0x0059:
        if (r14 == 0) goto L_0x0077;
    L_0x005b:
        r2 = r1.c;	 Catch:{ all -> 0x0079 }
        r2.a(r14);	 Catch:{ all -> 0x0079 }
        r2 = r1.c;	 Catch:{ all -> 0x0079 }
        r3 = r24;
        r4 = r14;
        r5 = r10;
        r7 = r12;
        r2.a(r3, r4, r5, r7);	 Catch:{ all -> 0x0079 }
        r3 = r9;
        r4 = r14;
        r5 = r10;
        r7 = r12;
        r3.a(r4, r5, r7);	 Catch:{ all -> 0x0079 }
        goto L_0x0077;
    L_0x0072:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x0079 }
        throw r0;	 Catch:{ all -> 0x0079 }
    L_0x0077:
        monitor-exit(r23);
        return;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r23);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.u(java.lang.String):void");
    }

    private final boolean B(String str) {
        xvd.a(str);
        return this.c.b(str);
    }

    public final boolean a(String str, List list) {
        String str2 = "adbreaks";
        xvd.a(str);
        amqw.a((Object) list);
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            if (this.c.b(str)) {
                SQLiteDatabase a = this.e.a.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put(str2, xvw.b(afns.a(list).toString()));
                contentValues.put("original_video_id", str);
                a.insert(str2, null, contentValues);
                f.setTransactionSuccessful();
                return true;
            }
            f.endTransaction();
            return false;
        } finally {
            f.endTransaction();
        }
    }

    public final List v(String str) {
        xvd.a(str);
        Cursor query;
        try {
            List emptyList;
            query = this.e.a.a().query("adbreaks", new String[]{"adbreaks"}, "original_video_id=?", new String[]{str}, null, null, null, null);
            if (query.getCount() <= 0) {
                emptyList = Collections.emptyList();
                query.close();
            } else {
                query.moveToNext();
                emptyList = vsd.j.a(new JSONArray(xvw.c(query.getBlob(0))));
                query.close();
            }
            return emptyList;
        } catch (IOException | JSONException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
            stringBuilder.append("Error loading ad breaks [originalVideoId=");
            stringBuilder.append(str);
            stringBuilder.append("]");
            xtl.a(stringBuilder.toString(), e);
            return Collections.emptyList();
        } catch (Throwable th) {
            query.close();
        }
    }

    public final vse a(String str, String str2) {
        xvd.a(str);
        amqw.a((Object) str2);
        vse vse = null;
        Cursor query;
        try {
            ager a = this.f.a(str, str2);
            if (a != null) {
                String str3 = a.c;
                if (str3 != null) {
                    agqn a2 = a(str3, null);
                    if (a2 != null) {
                        agql agql = a2.a;
                        if (agql != null && agql.u()) {
                        }
                    }
                    return null;
                }
            }
            query = this.f.c.a().query("ads", new String[]{"vast"}, "original_video_id=? AND ad_break_id=?", new String[]{str, str2}, null, null, null, null);
            if (query.moveToNext()) {
                vse vse2 = (vse) vse.b.b(new JSONObject(xvw.c(query.getBlob(0))));
                query.close();
                vse = vse2;
            } else {
                query.close();
            }
            return vse;
        } catch (IOException | JSONException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
            stringBuilder.append("Error loading ad [originalVideoId=");
            stringBuilder.append(str);
            stringBuilder.append("]");
            xtl.a(stringBuilder.toString(), e);
            return null;
        } catch (Throwable th) {
            query.close();
        }
    }

    public final void b(String str, String str2) {
        this.f.c.a().execSQL("UPDATE ads SET vast_playback_count = vast_playback_count + 1 WHERE original_video_id = ? AND ad_break_id = ?", new Object[]{str, str2});
    }

    public final List e() {
        SQLiteDatabase a = this.f.c.a();
        String str = "ads";
        String b = xbs.b(str, ages.a);
        String str2 = "ad_videos";
        String b2 = xbs.b(str2, ageq.a);
        String[] strArr = new String[1];
        strArr[0] = "ad_video_id";
        String a2 = xbs.a(str, strArr);
        String a3 = xbs.a(str2, "ad_video_id");
        int length = String.valueOf(b).length();
        int length2 = String.valueOf(b2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 44) + length2) + String.valueOf(a2).length()) + String.valueOf(a3).length());
        stringBuilder.append("SELECT ");
        stringBuilder.append(b);
        stringBuilder.append(",");
        stringBuilder.append(b2);
        stringBuilder.append(" FROM ads LEFT JOIN ad_videos ON ");
        stringBuilder.append(a2);
        stringBuilder.append(" = ");
        stringBuilder.append(a3);
        Cursor rawQuery = a.rawQuery(stringBuilder.toString(), null);
        try {
            List emptyList;
            if (rawQuery.getCount() <= 0) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    emptyList.add(new ageu(ager.a(str, rawQuery), agep.a(str2, rawQuery)));
                }
                rawQuery.close();
            }
            return emptyList;
        } finally {
            rawQuery.close();
        }
    }

    public final void w(String str) {
        this.g.b.a().execSQL("UPDATE ad_videos SET playback_count = playback_count + 1 WHERE ad_video_id = ?", new Object[]{str});
    }

    public final void x(String str) {
        this.g.b.a().execSQL("UPDATE ad_videos SET playback_count = 0 WHERE ad_video_id = ?", new Object[]{str});
    }

    public final void b(String str, agqf agqf) {
        if (this.g.a(str)) {
            this.g.b.a().execSQL("UPDATE ad_videos SET status = ? WHERE ad_video_id = ?", new Object[]{Integer.valueOf(agqf.p), str});
        }
    }

    public final agpx y(String str) {
        Cursor query;
        try {
            agpx agpx;
            query = this.n.b.a().query("drm", agfn.a, "video_id=? ", new String[]{str}, null, null, null, null);
            query.moveToNext();
            if (query.isAfterLast()) {
                agpx = null;
            } else {
                String string = query.getString(query.getColumnIndexOrThrow("video_id"));
                byte[] blob = query.getBlob(query.getColumnIndexOrThrow("key_set_id"));
                String string2 = query.getString(query.getColumnIndexOrThrow("mimetype"));
                byte[] blob2 = query.getBlob(query.getColumnIndexOrThrow("pssh_data"));
                String string3 = query.getString(query.getColumnIndexOrThrow("license_server_url"));
                long j = query.getLong(query.getColumnIndexOrThrow("last_updated_timestamp"));
                String string4 = query.getString(query.getColumnIndexOrThrow("last_update_gls_authorized_formats"));
                String string5 = query.getString(query.getColumnIndexOrThrow("drm_params"));
                query.getInt(query.getColumnIndexOrThrow("last_update_sdk_version"));
                query.getLong(query.getColumnIndexOrThrow("last_update_attempt_timestamp"));
                query.getInt(query.getColumnIndexOrThrow("last_update_attempt_http_code"));
                query.getInt(query.getColumnIndexOrThrow("last_update_attempt_gls_code"));
                agpx agpx2 = new agpx(string, blob, string2, blob2, string3, j, string4, string5);
            }
            query.close();
            return agpx;
        } catch (SQLException e) {
            str = String.valueOf(str);
            String str2 = "Unable to fetch DRM content for ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            xtl.a(str, e);
            return null;
        } catch (Throwable th) {
            query.close();
        }
    }

    public final boolean a(String str, String str2, byte[] bArr, byte[] bArr2, String str3, long j, List list, String str4) {
        String str5 = "drm";
        String str6 = "video_id";
        try {
            agfn agfn = this.n;
            agpx agpx = new agpx(str, bArr2, str2, bArr, str3, j, list, str4);
            ContentValues contentValues = new ContentValues();
            contentValues.put(str6, agpx.a);
            contentValues.put("key_set_id", agpx.b);
            contentValues.put("mimetype", agpx.c);
            contentValues.put("pssh_data", agpx.d);
            contentValues.put("license_server_url", agpx.e);
            contentValues.put("last_updated_timestamp", Long.valueOf(agpx.f));
            contentValues.put("last_update_gls_authorized_formats", amqh.a(',').a(agpx.g));
            contentValues.put("drm_params", agpx.h);
            Integer valueOf = Integer.valueOf(0);
            contentValues.put("last_update_sdk_version", valueOf);
            contentValues.put("last_update_attempt_timestamp", valueOf);
            contentValues.put("last_update_attempt_http_code", valueOf);
            contentValues.put("last_update_attempt_gls_code", valueOf);
            SQLiteDatabase a = agfn.b.a();
            if (a.insert(str5, null, contentValues) == -1) {
                contentValues.remove(str6);
                amqw.b(a.update(str5, contentValues, "video_id=? ", new String[]{agpx.a}) == 1);
            }
            return true;
        } catch (SQLException e) {
            str6 = String.valueOf(str);
            String str7 = "Error updating DRM data for ";
            xtl.a(str6.length() == 0 ? new String(str7) : str7.concat(str6), e);
            return false;
        }
    }

    public final boolean z(String str) {
        try {
            this.n.b.a().delete("drm", "video_id=? ", new String[]{str});
            return true;
        } catch (SQLException e) {
            str = String.valueOf(str);
            String str2 = "Error removing DRM data for ";
            xtl.a(str.length() == 0 ? new String(str2) : str2.concat(str), e);
            return false;
        }
    }

    public final void a(String str, Set set) {
        String str2 = "original_video_id=?";
        amqw.a((Object) str);
        amqw.a((Object) set);
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            for (String str3 : this.f.b(str, "ad_video_id")) {
                if (this.f.a(str3) <= 1) {
                    this.g.b.a().delete("ad_videos", "ad_video_id=?", new String[]{str3});
                    if (!B(str3)) {
                        a(str3, set.contains(str3));
                    }
                }
            }
            for (String str32 : this.f.b(str, "ad_intro_video_id")) {
                if (this.f.a("SELECT COUNT(DISTINCT ad_video_id) FROM ads WHERE ad_intro_video_id=?", new String[]{str32}) <= 1 && !B(str32)) {
                    a(str32, set.contains(str32));
                }
            }
            this.f.c.a().delete("ads", str2, new String[]{str});
            this.e.a.a().delete("adbreaks", str2, new String[]{str});
            f.setTransactionSuccessful();
        } finally {
            f.endTransaction();
        }
    }

    public final SQLiteDatabase f() {
        return this.h.d();
    }

    public final synchronized boolean a(agqp agqp, avsi avsi, int i, agqq agqq, int i2, byte[] bArr, agqf agqf) {
        synchronized (this) {
            amqw.a((Object) agqp);
            SQLiteDatabase f = f();
            f.beginTransaction();
            try {
                long a = this.o.a();
                this.c.a(agqp, agqf, agqq, ahdl.a(avsi, 360), i, i2, a, bArr);
                this.d.i(agqp.a());
                this.h.a(agqp, avsi, i2, bArr, agqf, agqq, a);
                this.h.h(agqp.a());
                f.setTransactionSuccessful();
                f.endTransaction();
            } catch (SQLException e) {
                try {
                    xtl.a("Error inserting single video", e);
                    return false;
                } finally {
                    f.endTransaction();
                }
            }
        }
        return true;
    }

    public final synchronized boolean a(agqi agqi, avsi avsi, int i, int i2, byte[] bArr, long j, int i3) {
        byte[] bArr2 = bArr;
        synchronized (this) {
            amqw.a((Object) agqi);
            try {
                agfu agfu = this.d;
                avsi avsi2 = avsi;
                int a = ahdl.a(avsi, 360);
                agqi agqi2 = agqi;
                ContentValues a2 = agfu.a(agqi, agfu.b);
                a2.put("preferred_stream_quality", Integer.valueOf(a));
                String str = "offline_audio_quality";
                int i4 = i - 1;
                if (i != 0) {
                    a2.put(str, Integer.valueOf(i4));
                    a2.put("offline_source_ve_type", Integer.valueOf(i2));
                    if (bArr2 != null) {
                        a2.put("player_response_tracking_params", bArr2);
                    }
                    a2.put("playlist_added_timestamp_millis", Long.valueOf(j));
                    a2.put("playlist_offline_request_source", Integer.valueOf(i3));
                    a2.put("playlist_client_last_invalidation_timestamp", Long.valueOf(0));
                    agfu.a.a().insertOrThrow("playlistsV13", null, a2);
                    int size = this.h.c().size();
                    this.h.a(agqi, new ArrayList(), avsi, i2, j, i3);
                    if (size == 0 && this.h.c().size() == 1) {
                        for (agfh b : this.a) {
                            b.b();
                        }
                    }
                } else {
                    throw null;
                }
            } catch (SQLException e) {
                xtl.a("Error inserting playlist", e);
                return false;
            }
        }
        return true;
    }

    public final boolean a(agqi agqi, List list, avsi avsi, int i, Set set, agqq agqq, int i2, byte[] bArr) {
        agqi agqi2 = agqi;
        List list2 = list;
        avsi avsi2 = avsi;
        Set set2 = set;
        byte[] bArr2 = bArr;
        String str = "playlist_video";
        amqw.a((Object) agqi);
        amqw.a((Object) list);
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            byte[] bArr3;
            agfu agfu = this.d;
            String str2 = agqi2.a;
            Collection a = agic.a(agfu.c(str2), list2);
            agfu.a.a().delete(str, "playlist_id = ?", new String[]{str2});
            for (agft a2 : agfu.d) {
                a2.a(a);
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < list.size(); i3++) {
                agqp agqp = (agqp) list2.get(i3);
                String a3 = agqp.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("playlist_id", str2);
                contentValues.put("video_id", a3);
                contentValues.put("index_in_playlist", Integer.valueOf(i3));
                contentValues.put("saved_timestamp", Long.valueOf(agfu.b.a()));
                agfu.a.a().insertOrThrow(str, null, contentValues);
                if (!agfu.c.c(a3)) {
                    agqf agqf;
                    agio agio = agfu.c;
                    if (set2.contains(a3)) {
                        agqf = agqf.ACTIVE;
                    } else {
                        agqf = agqf.STREAM_DOWNLOAD_PENDING;
                    }
                    agio.a(agqp, agqf, agqq, ahdl.a(avsi2, 360), i, i2, agfu.b.a(), bArr);
                } else if (set2.contains(a3) && (agfu.c.a(a3) == agqf.STREAM_DOWNLOAD_PENDING || agfu.c.a(a3) == agqf.METADATA_ONLY)) {
                    agfu.c.a(a3, agqf.ACTIVE);
                } else {
                    agfu.c.a(agqp);
                }
                hashSet.add(a3);
            }
            for (agft a4 : agfu.d) {
                HashSet hashSet2 = hashSet;
                bArr3 = bArr2;
                a4.a(agqi, list, hashSet, avsi, i2, bArr, set, agqq);
                bArr2 = bArr3;
                hashSet = hashSet2;
                list2 = list;
            }
            bArr3 = bArr2;
            agfu agfu2 = this.d;
            int a5 = ahdl.a(avsi2, 360);
            ContentValues a6 = agfu.a(agqi2, agfu2.b);
            a6.put("preferred_stream_quality", Integer.valueOf(a5));
            a6.put("offline_source_ve_type", Integer.valueOf(i2));
            if (bArr3 != null) {
                a6.put("player_response_tracking_params", bArr3);
            }
            long update = (long) agfu2.a.a().update("playlistsV13", a6, "id = ?", new String[]{agqi2.a});
            if (update == 1) {
                f.setTransactionSuccessful();
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Update playlist affected ");
            stringBuilder.append(update);
            stringBuilder.append(" rows");
            throw new SQLException(stringBuilder.toString());
        } catch (SQLException e) {
            xtl.a("Error syncing playlist", e);
            return false;
        } finally {
            f.endTransaction();
        }
    }
}
