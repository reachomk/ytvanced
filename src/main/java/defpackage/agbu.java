package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: agbu */
public final class agbu implements agwf {
    public static final long l = TimeUnit.MINUTES.toMillis(2);
    public final bcaa a;
    public final agbg b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final String f;
    public final xah g;
    public final agwa h;
    public final xsc i;
    public final agdv j = new agdv();
    public final agca k = new agca(this);
    private final bcaa m;
    private final bcaa n;
    private final bcaa o;
    private final zzl p;
    private final ahdm q;
    private final bcaa r;
    private final Executor s;

    public agbu(bcaa bcaa, agbg agbg, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, zzl zzl, String str, xah xah, ahdm ahdm, agwa agwa, xsc xsc, bcaa bcaa8, Executor executor) {
        this.a = bcaa;
        this.b = agbg;
        this.c = bcaa2;
        this.m = bcaa3;
        this.n = bcaa4;
        this.d = bcaa5;
        this.e = bcaa6;
        this.o = bcaa7;
        this.p = zzl;
        this.f = str;
        this.g = xah;
        this.q = ahdm;
        this.h = agwa;
        this.i = xsc;
        this.r = bcaa8;
        this.s = executor;
    }

    public final Collection a() {
        if (this.b.v()) {
            return ((agif) this.o.get()).b();
        }
        return amul.g();
    }

    public final Collection b() {
        if (!this.b.v()) {
            return amul.g();
        }
        ArrayList arrayList = new ArrayList();
        for (agqt agqt : ((agif) this.o.get()).b()) {
            if (agqt.a.c == 2) {
                arrayList.add(agqt);
            }
        }
        return arrayList;
    }

    public final agqt a(String str) {
        if (this.b.v()) {
            xvd.a(str);
            agig g = ((agif) this.o.get()).g(str);
            if (g != null) {
                return g.b();
            }
        }
        return null;
    }

    public final List b(String str) {
        if (this.b.v()) {
            return d(str);
        }
        return amul.g();
    }

    public final anjv c(String str) {
        return agbf.a(this.b.u(), new agbx(this, str), amul.g(), this.s);
    }

    public final List d(String str) {
        agqt a = a(str);
        if (a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        agci agci = (agci) this.d.get();
        for (String a2 : a.b) {
            agqy a3 = agci.a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public final Set e(String str) {
        if (!this.b.v()) {
            return amwp.a;
        }
        HashSet hashSet;
        agip e = ((agif) this.o.get()).e();
        synchronized (e.l) {
            xvd.a(str);
            hashSet = new HashSet();
            Set<String> b = xsb.b(e.j, str);
            if (b != null) {
                if (!b.isEmpty()) {
                    for (String str2 : b) {
                        agiu agiu = (agiu) e.b.get(str2);
                        if (!(agiu == null || agiu.h() == null)) {
                            hashSet.add(agiu.h());
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public final agqu f(String str) {
        if (this.b.v()) {
            agea a = this.j.a(str);
            if (a == null) {
                agqt a2 = a(str);
                if (a2 != null) {
                    this.j.a(a2.a, null);
                    a = this.j.a(str);
                }
            }
            if (a != null) {
                return a.c();
            }
        }
        return null;
    }

    public final List c() {
        xak.b();
        if (!this.b.v()) {
            return amul.g();
        }
        Cursor query = ((aghw) this.e.get()).a.a().query("video_listsV13", aghz.a, "type = ?", new String[]{"1"}, null, null, "saved_timestamp DESC", null);
        try {
            List b = new aghx(query).b();
            return b;
        } finally {
            query.close();
        }
    }

    public final agqr g(String str) {
        xak.b();
        return this.b.v() ? ((aghw) this.e.get()).b(str) : null;
    }

    public final boolean a(agqr agqr) {
        xak.b();
        return this.b.v() ? b(agqr) : false;
    }

    private final boolean b(agqr agqr) {
        this.q.a(true);
        try {
            aghw aghw = (aghw) this.e.get();
            xsc xsc = aghw.b;
            ContentValues contentValues = new ContentValues();
            long a = xsc.a();
            contentValues.put("id", agqr.a);
            contentValues.put("type", Integer.valueOf(agqr.c));
            contentValues.put("size", Integer.valueOf(agqr.b));
            Long valueOf = Long.valueOf(a);
            contentValues.put("last_update_timestamp", valueOf);
            contentValues.put("saved_timestamp", valueOf);
            contentValues.put("video_list_offline_request_source", Integer.valueOf(2));
            aghw.a.a().insertOrThrow("video_listsV13", null, contentValues);
            ((agif) this.o.get()).a(agqr, Collections.emptyList(), null, 2);
            return true;
        } catch (SQLException e) {
            xtl.a("Error inserting offline video list.", e);
            return false;
        }
    }

    public final void a(String str, List list) {
        a(str, list, avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE, Long.MAX_VALUE, ((agvs) this.a.get()).g(), agqq.OFFLINE_IMMEDIATELY, -1, zzp.b, 0);
    }

    public final void a(String str, List list, avrp avrp, long j, avsi avsi, agqq agqq, int i, byte[] bArr, int i2) {
        this.b.a(new agbt(this, str, list, avrp, j, avsi, agqq, i, bArr, i2));
    }

    public final void b(String str, List list) {
        this.b.a(new agbw(this, str, list));
    }

    public final void a(String str, avrp avrp, long j) {
        this.b.a(new agbv(this, str, avrp, j));
    }

    public final Set h(String str) {
        if (!this.b.v()) {
            return amwp.a;
        }
        xvd.a(str);
        return ((agif) this.o.get()).i(str);
    }

    public final void i(String str) {
        this.b.a(new agby(this, str));
    }

    /* Access modifiers changed, original: final */
    public final void j(String str) {
        xak.b();
        if (((aghw) this.e.get()).b(str) != null) {
            k(str);
        }
    }

    private final synchronized void k(String str) {
        xvd.a(str);
        SQLiteDatabase d = ((agif) this.o.get()).d();
        d.beginTransaction();
        try {
            aghw aghw = (aghw) this.e.get();
            long delete = (long) aghw.a.a().delete("video_listsV13", "id = ?", new String[]{str});
            if (delete == 1) {
                List a = aghw.a(str);
                aghw.a.a().delete("video_list_videos", "video_list_id = ?", new String[]{str});
                for (aghy a2 : aghw.c) {
                    a2.a(a);
                }
                d.setTransactionSuccessful();
                this.j.b(str);
                String.valueOf(str).length();
                this.b.a(new aglo(str));
                d.endTransaction();
            } else {
                StringBuilder stringBuilder = new StringBuilder(52);
                stringBuilder.append("Delete video list affected ");
                stringBuilder.append(delete);
                stringBuilder.append(" rows");
                throw new SQLException(stringBuilder.toString());
            }
        } catch (SQLException e) {
            try {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 40);
                stringBuilder2.append("Error deleting video list ");
                stringBuilder2.append(str);
                stringBuilder2.append(" from database");
                xtl.a(stringBuilder2.toString(), e);
            } finally {
                d.endTransaction();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(agqu agqu) {
        if (agqu != null) {
            this.b.a(new agln(agqu));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04cb A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    public final void a(java.lang.String r32, java.util.List r33, defpackage.avrp r34, long r35, boolean r37, boolean r38, int r39, defpackage.avsi r40, defpackage.agqq r41, int r42, byte[] r43, int r44) {
        /*
        r31 = this;
        r7 = r31;
        r6 = r32;
        r5 = r40;
        r4 = r41;
        defpackage.xak.b();
        r0 = defpackage.avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE;
        r1 = r34;
        if (r1 != r0) goto L_0x0027;
    L_0x0011:
        r0 = r7.p;
        r0 = r0.b();
        r0 = r0.h;
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        r0 = defpackage.avoa.w;
    L_0x001d:
        if (r37 != 0) goto L_0x0027;
    L_0x001f:
        r0 = r0.j;
        if (r0 != 0) goto L_0x0027;
    L_0x0023:
        r0 = defpackage.avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
        r13 = r0;
        goto L_0x0028;
    L_0x0027:
        r13 = r1;
    L_0x0028:
        r0 = r31.a(r32);
        if (r0 == 0) goto L_0x04cb;
    L_0x002e:
        r1 = r7.a;
        r1 = r1.get();
        r1 = (defpackage.agvs) r1;
        r21 = r1.b(r5);
        r1 = r0.a;
        r2 = r7.e;
        r2 = r2.get();
        r2 = (defpackage.aghw) r2;
        r15 = 1;
        r22 = 0;
        if (r38 == 0) goto L_0x004d;
    L_0x0049:
        r9 = r43;
        goto L_0x011d;
    L_0x004d:
        r8 = r2.b;
        r8 = defpackage.aghw.a(r1, r8, r13);
        r9 = r2.a;
        r9 = r9.a();
        r10 = new java.lang.String[r15];
        r11 = r1.a;
        r10[r22] = r11;
        r11 = "id = ?";
        r12 = "video_listsV13";
        r8 = r9.update(r12, r8, r11, r10);
        r8 = (long) r8;
        r10 = " rows";
        r14 = "Update video list affected ";
        r16 = 1;
        r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r18 != 0) goto L_0x04b1;
    L_0x0072:
        r8 = new android.content.ContentValues;
        r8.<init>();
        r9 = r5.k;
        r9 = java.lang.Integer.valueOf(r9);
        r3 = "format_type";
        r8.put(r3, r9);
        r3 = r2.a;
        r3 = r3.a();
        r9 = new java.lang.String[r15];
        r9[r22] = r6;
        r3 = r3.update(r12, r8, r11, r9);
        r8 = (long) r3;
        r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x0497;
    L_0x0095:
        r3 = new android.content.ContentValues;
        r3.<init>();
        r8 = r21 + -1;
        if (r21 == 0) goto L_0x0495;
    L_0x009e:
        r8 = java.lang.Integer.valueOf(r8);
        r9 = "offline_audio_quality";
        r3.put(r9, r8);
        r8 = r2.a;
        r8 = r8.a();
        r9 = new java.lang.String[r15];
        r9[r22] = r6;
        r3 = r8.update(r12, r3, r11, r9);
        r8 = (long) r3;
        r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x047b;
    L_0x00ba:
        r3 = new android.content.ContentValues;
        r3.<init>();
        r8 = r4.c;
        r8 = java.lang.Integer.valueOf(r8);
        r9 = "stream_transfer_condition";
        r3.put(r9, r8);
        r8 = r2.a;
        r8 = r8.a();
        r9 = new java.lang.String[r15];
        r9[r22] = r6;
        r3 = r8.update(r12, r3, r11, r9);
        r8 = (long) r3;
        r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x0461;
    L_0x00dd:
        r3 = new android.content.ContentValues;
        r3.<init>();
        r8 = java.lang.Integer.valueOf(r42);
        r9 = "source_ve_type";
        r3.put(r9, r8);
        r8 = r2.a;
        r8 = r8.a();
        r9 = new java.lang.String[r15];
        r9[r22] = r6;
        r3 = r8.update(r12, r3, r11, r9);
        r8 = (long) r3;
        r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x0447;
    L_0x00fe:
        r3 = new android.content.ContentValues;
        r3.<init>();
        r8 = "tracking_params";
        r9 = r43;
        r3.put(r8, r9);
        r2 = r2.a;
        r2 = r2.a();
        r8 = new java.lang.String[r15];
        r8[r22] = r6;
        r2 = r2.update(r12, r3, r11, r8);
        r2 = (long) r2;
        r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r8 != 0) goto L_0x042d;
    L_0x011d:
        if (r37 == 0) goto L_0x01eb;
    L_0x011f:
        r2 = r7.c;
        r2 = r2.get();
        r2 = (defpackage.agdq) r2;
        r3 = r0.b;
        if (r6 == 0) goto L_0x012d;
    L_0x012b:
        r8 = 1;
        goto L_0x012e;
    L_0x012d:
        r8 = 0;
    L_0x012e:
        defpackage.amqw.a(r8);
        r8 = 0;
        r10 = defpackage.amqu.a(r8);
        if (r10 != 0) goto L_0x013b;
    L_0x0138:
        r24 = 0;
        goto L_0x013d;
    L_0x013b:
        r24 = r6;
    L_0x013d:
        r8 = new java.util.HashSet;
        r8.<init>();
        r26 = new java.util.LinkedHashSet;
        r26.<init>();
        r10 = new java.util.ArrayList;
        r10.<init>();
        r11 = new java.util.ArrayList;
        r11.<init>();
        r12 = defpackage.avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE;
        r16 = 0;
        if (r13 != r12) goto L_0x01c6;
    L_0x0157:
        defpackage.amqw.a(r32);
        r12 = r2.b;
        r12 = r12.get();
        r12 = (defpackage.agbu) r12;
        r12 = r12.a(r6);
        if (r12 != 0) goto L_0x0169;
    L_0x0168:
        goto L_0x01c6;
    L_0x0169:
        r10 = r12.c;
        defpackage.amqw.a(r10);
        r12 = r2.a(r10);
        if (r12 != 0) goto L_0x0177;
    L_0x0174:
        r12 = r35;
        goto L_0x0179;
    L_0x0177:
        r12 = -9223372036854775808;
    L_0x0179:
        r14 = r3.iterator();
        r18 = r16;
    L_0x017f:
        r20 = r14.hasNext();
        if (r20 == 0) goto L_0x01a7;
    L_0x0185:
        r20 = r14.next();
        r15 = r20;
        r15 = (java.lang.String) r15;
        r20 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r20 >= 0) goto L_0x01a7;
    L_0x0191:
        r20 = r10.contains(r15);
        if (r20 != 0) goto L_0x01a3;
    L_0x0197:
        r5 = 0;
        r27 = r2.a(r15, r5, r6);
        r12 = r12 + r27;
        r18 = r18 - r27;
        r8.add(r15);
    L_0x01a3:
        r5 = r40;
        r15 = 1;
        goto L_0x017f;
    L_0x01a7:
        r2 = r3.iterator();
    L_0x01ab:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x01c1;
    L_0x01b1:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r5 = r8.contains(r3);
        if (r5 != 0) goto L_0x01ab;
    L_0x01bd:
        r11.add(r3);
        goto L_0x01ab;
    L_0x01c1:
        r27 = r10;
        r29 = r18;
        goto L_0x01ca;
    L_0x01c6:
        r27 = r10;
        r29 = r16;
    L_0x01ca:
        r2 = r11.isEmpty();
        if (r2 == 0) goto L_0x01dc;
    L_0x01d0:
        r2 = new agdn;
        r28 = 0;
        r23 = r2;
        r25 = r8;
        r23.<init>(r24, r25, r26, r27, r28, r29);
        goto L_0x01e7;
    L_0x01dc:
        r2 = new agdn;
        r23 = r2;
        r25 = r8;
        r28 = r11;
        r23.<init>(r24, r25, r26, r27, r28, r29);
    L_0x01e7:
        r8 = r2;
        r23 = 1;
        goto L_0x0214;
    L_0x01eb:
        r2 = r7.c;
        r2 = r2.get();
        r8 = r2;
        r8 = (defpackage.agdq) r8;
        r11 = r0.b;
        r2 = defpackage.agqq.DEFER_FOR_DISCOUNTED_DATA;
        if (r4 != r2) goto L_0x01fc;
    L_0x01fa:
        r15 = 1;
        goto L_0x01fd;
    L_0x01fc:
        r15 = 0;
    L_0x01fd:
        r2 = 0;
        r9 = r2;
        r10 = r32;
        r12 = r33;
        r14 = r43;
        r23 = 1;
        r16 = r42;
        r17 = r35;
        r19 = r40;
        r20 = r21;
        r2 = r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20);
        r8 = r2;
    L_0x0214:
        r2 = new java.util.HashMap;
        r2.<init>();
        r0 = r0.b;
        r0 = r0.iterator();
    L_0x021f:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x023f;
    L_0x0225:
        r3 = r0.next();
        r3 = (java.lang.String) r3;
        r5 = r7.d;
        r5 = r5.get();
        r5 = (defpackage.agci) r5;
        r5 = r5.a(r3);
        if (r5 == 0) goto L_0x021f;
    L_0x0239:
        r5 = r5.a;
        r2.put(r3, r5);
        goto L_0x021f;
    L_0x023f:
        r0 = r33.iterator();
    L_0x0243:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0257;
    L_0x0249:
        r3 = r0.next();
        r3 = (defpackage.agqp) r3;
        r5 = r3.a();
        r2.put(r5, r3);
        goto L_0x0243;
    L_0x0257:
        r0 = r8.c(r6);
        r3 = "UpdateVideoList: no video model found for ";
        if (r0 == 0) goto L_0x02e2;
    L_0x025f:
        r5 = r0.size();
        r9 = r1.b;
        if (r5 == r9) goto L_0x0272;
    L_0x0267:
        r5 = new agqr;
        r0 = r0.size();
        r5.<init>(r1, r0);
        r9 = r5;
        goto L_0x0273;
    L_0x0272:
        r9 = r1;
    L_0x0273:
        r10 = r9.a;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r8.c(r10);
        if (r0 == 0) goto L_0x02df;
    L_0x0280:
        r0 = r8.c(r10);
        r0 = r0.iterator();
    L_0x0288:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x02bc;
    L_0x028e:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r11 = r2.containsKey(r1);
        if (r11 == 0) goto L_0x02a4;
    L_0x029a:
        r1 = r2.get(r1);
        r1 = (defpackage.agqp) r1;
        r5.add(r1);
        goto L_0x0288;
    L_0x02a4:
        r1 = java.lang.String.valueOf(r1);
        r11 = r1.length();
        if (r11 != 0) goto L_0x02b4;
    L_0x02ae:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x02b8;
    L_0x02b4:
        r1 = r3.concat(r1);
    L_0x02b8:
        defpackage.xtl.c(r1);
        goto L_0x0288;
    L_0x02bc:
        r3 = defpackage.agqf.ACTIVE;
        r0 = r31;
        r1 = r9;
        r2 = r5;
        r4 = r40;
        r5 = r42;
        r15 = r6;
        r6 = r43;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
        if (r0 == 0) goto L_0x0352;
    L_0x02cf:
        r0 = r8.b(r10);
        r0 = r7.a(r9, r0);
        if (r0 != 0) goto L_0x02db;
    L_0x02d9:
        goto L_0x0352;
    L_0x02db:
        r22 = 1;
        goto L_0x0352;
    L_0x02df:
        r15 = r6;
        goto L_0x0352;
    L_0x02e2:
        r15 = r6;
        r0 = r8.b(r15);
        r0 = r0.size();
        r4 = r1.b;
        if (r0 == r4) goto L_0x02fe;
    L_0x02ef:
        r0 = new agqr;
        r4 = r8.b(r15);
        r4 = r4.size();
        r0.<init>(r1, r4);
        r9 = r0;
        goto L_0x02ff;
    L_0x02fe:
        r9 = r1;
    L_0x02ff:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r9.a;
        r0 = r8.b(r0);
        r0 = r0.iterator();
    L_0x030e:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0342;
    L_0x0314:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r5 = r2.containsKey(r1);
        if (r5 == 0) goto L_0x032a;
    L_0x0320:
        r1 = r2.get(r1);
        r1 = (defpackage.agqp) r1;
        r4.add(r1);
        goto L_0x030e;
    L_0x032a:
        r1 = java.lang.String.valueOf(r1);
        r5 = r1.length();
        if (r5 != 0) goto L_0x033a;
    L_0x0334:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x033e;
    L_0x033a:
        r1 = r3.concat(r1);
    L_0x033e:
        defpackage.xtl.c(r1);
        goto L_0x030e;
    L_0x0342:
        r3 = defpackage.agqf.ACTIVE;
        r0 = r31;
        r1 = r9;
        r2 = r4;
        r4 = r40;
        r5 = r42;
        r6 = r43;
        r22 = r0.a(r1, r2, r3, r4, r5, r6);
    L_0x0352:
        if (r22 == 0) goto L_0x0408;
    L_0x0354:
        r0 = java.lang.String.valueOf(r32);
        r0.length();
        r0 = r7.b;
        r1 = new aglq;
        r1.<init>(r15);
        r0.a(r1);
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = r8.a(r15);
        r1 = r1.iterator();
    L_0x0372:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0386;
    L_0x0378:
        r2 = r1.next();
        r2 = (defpackage.agqp) r2;
        r2 = r2.a();
        r0.add(r2);
        goto L_0x0372;
    L_0x0386:
        r1 = r7.j;
        r1.a(r9, r0);
        r1 = r7.j;
        r1 = r1.a(r15);
        r1 = r1.c();
        r7.a(r1);
        r1 = r7.d;
        r1 = r1.get();
        r1 = (defpackage.agci) r1;
        r2 = r7.r;
        r2 = r2.get();
        r2 = (defpackage.agdz) r2;
        r3 = r1.a();
        r3 = r3.size();
        r2.a(r3);
        r2 = r2.b();
        r2.a(r0);
        r0 = r2.a();
        r1.a(r0);
        r0 = r7.n;
        r0 = r0.get();
        r0 = (defpackage.afzq) r0;
        r1 = r33;
        r0.a(r1);
        r0 = r7.m;
        r0 = r0.get();
        r0 = (defpackage.agdo) r0;
        r1 = r8.a(r15);
        r1 = r1.iterator();
    L_0x03de:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0407;
    L_0x03e4:
        r9 = 0;
        r2 = r1.next();
        r2 = (defpackage.agqp) r2;
        r10 = r2.a();
        r14 = 1;
        r17 = 0;
        r19 = 0;
        r8 = r0;
        r11 = r32;
        r12 = r40;
        r13 = r21;
        r2 = r15;
        r15 = r39;
        r16 = r41;
        r18 = r44;
        r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r15 = r2;
        goto L_0x03de;
    L_0x0407:
        return;
    L_0x0408:
        r2 = r15;
        r0 = java.lang.String.valueOf(r32);
        r0 = r0.length();
        r1 = new java.lang.StringBuilder;
        r0 = r0 + 38;
        r1.<init>(r0);
        r0 = "Failed syncing video list ";
        r1.append(r0);
        r1.append(r2);
        r0 = " to database";
        r1.append(r0);
        r0 = r1.toString();
        defpackage.xtl.c(r0);
        return;
    L_0x042d:
        r0 = new android.database.SQLException;
        r1 = new java.lang.StringBuilder;
        r4 = 52;
        r1.<init>(r4);
        r1.append(r14);
        r1.append(r2);
        r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0447:
        r4 = 52;
        r0 = new android.database.SQLException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r1.append(r14);
        r1.append(r8);
        r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0461:
        r4 = 52;
        r0 = new android.database.SQLException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r1.append(r14);
        r1.append(r8);
        r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x047b:
        r4 = 52;
        r0 = new android.database.SQLException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r1.append(r14);
        r1.append(r8);
        r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0495:
        r0 = 0;
        throw r0;
    L_0x0497:
        r4 = 52;
        r0 = new android.database.SQLException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r1.append(r14);
        r1.append(r8);
        r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x04b1:
        r4 = 52;
        r0 = new android.database.SQLException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r1.append(r14);
        r1.append(r8);
        r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x04cb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbu.a(java.lang.String, java.util.List, avrp, long, boolean, boolean, int, avsi, agqq, int, byte[], int):void");
    }

    public final synchronized void c(String str, List list) {
        xak.b();
        agqt a = a(str);
        if (a != null) {
            if (a(new agqr(a.a, list.size()), list, agqf.METADATA_ONLY, avsi.UNKNOWN_FORMAT_TYPE, -1, zzp.b)) {
                ((afzq) this.n.get()).a(list);
                agdo agdo = (agdo) this.m.get();
                for (agqp a2 : list) {
                    agdo.a(a2.a(), false);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 38);
            stringBuilder.append("Failed syncing video list ");
            stringBuilder.append(str);
            stringBuilder.append(" to database");
            xtl.c(stringBuilder.toString());
        }
    }

    private final synchronized boolean a(agqr agqr, List list, agqf agqf, avsi avsi, int i, byte[] bArr) {
        synchronized (this) {
            amqw.a((Object) agqr);
            amqw.a((Object) list);
            SQLiteDatabase d = ((agif) this.o.get()).d();
            d.beginTransaction();
            try {
                aghw aghw = (aghw) this.e.get();
                avsi avsi2 = avsi;
                aghw.a(agqr, list, agqf, avsi, ((agvs) this.a.get()).b(avsi), i, bArr);
                agqr agqr2 = agqr;
                aghw.a(agqr);
                d.setTransactionSuccessful();
                d.endTransaction();
            } catch (SQLException e) {
                try {
                    xtl.a("Error syncing playlist", e);
                    return false;
                } finally {
                    d.endTransaction();
                }
            }
        }
        return true;
    }

    private final synchronized boolean a(agqr agqr, List list) {
        amqw.a((Object) agqr);
        amqw.a((Object) list);
        SQLiteDatabase d = ((agif) this.o.get()).d();
        d.beginTransaction();
        try {
            ((aghw) this.e.get()).a(agqr, list);
            d.setTransactionSuccessful();
            d.endTransaction();
        } catch (SQLException e) {
            try {
                xtl.a("Error syncing final video list videos", e);
                return false;
            } finally {
                d.endTransaction();
            }
        }
        return true;
    }
}
