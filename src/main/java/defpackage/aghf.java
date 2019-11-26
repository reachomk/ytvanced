package defpackage;

import java.util.HashMap;

/* renamed from: aghf */
final class aghf implements xbt {
    private final HashMap a = new HashMap();

    aghf() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Unknown predecessor block by arg (r0_6 ?) in PHI: PHI: (r0_17 ?) = (r0_6 ?), (r0_0 ?) binds: {(r0_0 ?)=B:58:0x0361}
        	at jadx.core.dex.instructions.PhiInsn.replaceArg(PhiInsn.java:78)
        	at jadx.core.dex.visitors.ssa.SSATransform.inlinePhiInsn(SSATransform.java:392)
        	at jadx.core.dex.visitors.ssa.SSATransform.replacePhiWithMove(SSATransform.java:360)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiWithSameArgs(SSATransform.java:300)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixUselessPhi(SSATransform.java:275)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:61)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(android.database.sqlite.SQLiteDatabase r23) {
        /*
        r22 = this;
        r1 = r22;
        r0 = r23;
        r2 = "owner";
        r3 = "author";
        r4 = "CREATE TABLE playlistsV2 (id TEXT PRMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER)";
        r0.execSQL(r4);
        r4 = defpackage.agfj.a;
        r5 = "playlists";
        r4 = defpackage.xbs.a(r5, r4);
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r5 = r5 + 22;
        r6.<init>(r5);
        r5 = "SELECT ";
        r6.append(r5);
        r6.append(r4);
        r4 = " FROM playlists";
        r6.append(r4);
        r4 = r6.toString();
        r6 = 0;
        r4 = r0.rawQuery(r4, r6);
        r7 = r4.moveToNext();	 Catch:{ all -> 0x04cf }
        r11 = "title";
        r12 = "preferred_stream_quality";
        r13 = "saved_timestamp";
        r14 = "id";
        r15 = "";
        if (r7 != 0) goto L_0x0365;
        r4.close();
        r3 = "DROP TABLE playlists";
        r0.execSQL(r3);
        r3 = "CREATE TABLE videosV2 (id TEXT PRIMARY KEY,offline_video_data_proto BLOB,deleted INTEGER,channel_id TEXT,refresh_token TEXT,saved_timestamp INTEGER,last_refresh_timestamp INTEGER,last_playback_timestamp INTEGER,media_status INTEGER,preferred_stream_quality INTEGER,player_response_proto BLOB)";
        r0.execSQL(r3);
        r3 = defpackage.agfo.a;
        r4 = "videos";
        r3 = defpackage.xbs.a(r4, r3);
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r7 = new java.lang.StringBuilder;
        r4 = r4 + 19;
        r7.<init>(r4);
        r7.append(r5);
        r7.append(r3);
        r3 = " FROM videos";
        r7.append(r3);
        r3 = r7.toString();
        r3 = r0.rawQuery(r3, r6);
        r4 = r3.moveToNext();	 Catch:{ all -> 0x0360 }
        if (r4 != 0) goto L_0x00ce;
        r3.close();
        r2 = "DROP TABLE videos";
        r0.execSQL(r2);
        r2 = "CREATE TABLE channels (id TEXT PRMARY KEY,offline_channel_data_proto BLOB)";
        r0.execSQL(r2);
        r2 = r1.a;
        r2 = r2.entrySet();
        r2 = r2.iterator();
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00cd;
        r3 = r2.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = new android.content.ContentValues;
        r4.<init>();
        r5 = r3.getKey();
        r5 = (java.lang.String) r5;
        r4.put(r14, r5);
        r3 = r3.getValue();
        r3 = (defpackage.avnc) r3;
        r3 = r3.toByteArray();
        r5 = "offline_channel_data_proto";
        r4.put(r5, r3);
        r3 = "channels";
        r0.insertOrThrow(r3, r6, r4);
        goto L_0x009e;
        return;
        r4 = new android.content.ContentValues;	 Catch:{ all -> 0x0360 }
        r4.<init>();	 Catch:{ all -> 0x0360 }
        r5 = r3.getColumnIndex(r14);	 Catch:{ all -> 0x0360 }
        r5 = r3.getString(r5);	 Catch:{ all -> 0x0360 }
        r7 = r3.getColumnIndex(r2);	 Catch:{ all -> 0x0360 }
        r7 = r3.getString(r7);	 Catch:{ all -> 0x0360 }
        r16 = defpackage.avre.p;	 Catch:{ all -> 0x0360 }
        r16 = r16.createBuilder();	 Catch:{ all -> 0x0360 }
        r6 = r16;	 Catch:{ all -> 0x0360 }
        r6 = (defpackage.avrd) r6;	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r14);	 Catch:{ all -> 0x0360 }
        r8 = defpackage.xbs.a(r3, r8, r15);	 Catch:{ all -> 0x0360 }
        r6.a(r8);	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r11);	 Catch:{ all -> 0x0360 }
        r8 = defpackage.xbs.a(r3, r8, r15);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x035a;	 Catch:{ all -> 0x0360 }
        r10 = r9.a;	 Catch:{ all -> 0x0360 }
        r10 = r10 | 8;	 Catch:{ all -> 0x0360 }
        r9.a = r10;	 Catch:{ all -> 0x0360 }
        r9.e = r8;	 Catch:{ all -> 0x0360 }
        r8 = 1;	 Catch:{ all -> 0x0360 }
        r8 = new java.lang.String[r8];	 Catch:{ all -> 0x0360 }
        r9 = "description";	 Catch:{ all -> 0x0360 }
        r9 = r3.getColumnIndex(r9);	 Catch:{ all -> 0x0360 }
        r9 = defpackage.xbs.a(r3, r9, r15);	 Catch:{ all -> 0x0360 }
        r10 = 0;	 Catch:{ all -> 0x0360 }
        r8[r10] = r9;	 Catch:{ all -> 0x0360 }
        r8 = defpackage.ajqy.a(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x0354;	 Catch:{ all -> 0x0360 }
        r9.j = r8;	 Catch:{ all -> 0x0360 }
        r8 = r9.a;	 Catch:{ all -> 0x0360 }
        r8 = r8 | 512;	 Catch:{ all -> 0x0360 }
        r9.a = r8;	 Catch:{ all -> 0x0360 }
        r8 = "duration";	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r8);	 Catch:{ all -> 0x0360 }
        r8 = r3.getInt(r8);	 Catch:{ all -> 0x0360 }
        r8 = (long) r8;	 Catch:{ all -> 0x0360 }
        r8 = defpackage.xvd.b(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x034e;	 Catch:{ all -> 0x0360 }
        r10 = r9.a;	 Catch:{ all -> 0x0360 }
        r10 = r10 | 16;	 Catch:{ all -> 0x0360 }
        r9.a = r10;	 Catch:{ all -> 0x0360 }
        r9.f = r8;	 Catch:{ all -> 0x0360 }
        r8 = "likes_count";	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r8);	 Catch:{ all -> 0x0360 }
        r8 = r3.getLong(r8);	 Catch:{ all -> 0x0360 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x0348;	 Catch:{ all -> 0x0360 }
        r10 = r9.a;	 Catch:{ all -> 0x0360 }
        r10 = r10 | 2048;	 Catch:{ all -> 0x0360 }
        r9.a = r10;	 Catch:{ all -> 0x0360 }
        r9.l = r8;	 Catch:{ all -> 0x0360 }
        r8 = "dislikes_count";	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r8);	 Catch:{ all -> 0x0360 }
        r8 = r3.getLong(r8);	 Catch:{ all -> 0x0360 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x0342;	 Catch:{ all -> 0x0360 }
        r10 = r9.a;	 Catch:{ all -> 0x0360 }
        r10 = r10 | 4096;	 Catch:{ all -> 0x0360 }
        r9.a = r10;	 Catch:{ all -> 0x0360 }
        r9.m = r8;	 Catch:{ all -> 0x0360 }
        r8 = "upload_date";	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r8);	 Catch:{ all -> 0x0360 }
        r8 = r3.getLong(r8);	 Catch:{ all -> 0x0360 }
        r17 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0360 }
        r8 = r8 / r17;	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r10 = r6.instance;	 Catch:{ all -> 0x0360 }
        r10 = (defpackage.avre) r10;	 Catch:{ all -> 0x0360 }
        r19 = r11;	 Catch:{ all -> 0x0360 }
        r11 = r10.a;	 Catch:{ all -> 0x0360 }
        r11 = r11 | 32;	 Catch:{ all -> 0x0360 }
        r10.a = r11;	 Catch:{ all -> 0x0360 }
        r10.g = r8;	 Catch:{ all -> 0x0360 }
        r8 = defpackage.aygk.f;	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x033c;	 Catch:{ all -> 0x0360 }
        r9.c = r8;	 Catch:{ all -> 0x0360 }
        r8 = r9.a;	 Catch:{ all -> 0x0360 }
        r8 = r8 | 2;	 Catch:{ all -> 0x0360 }
        r9.a = r8;	 Catch:{ all -> 0x0360 }
        r8 = "watch_uri";	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r8);	 Catch:{ all -> 0x0360 }
        r8 = defpackage.xbs.a(r3, r8, r15);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x0336;	 Catch:{ all -> 0x0360 }
        r10 = r9.a;	 Catch:{ all -> 0x0360 }
        r10 = r10 | 256;	 Catch:{ all -> 0x0360 }
        r9.a = r10;	 Catch:{ all -> 0x0360 }
        r9.i = r8;	 Catch:{ all -> 0x0360 }
        r8 = defpackage.avna.g;	 Catch:{ all -> 0x0360 }
        r8 = r8.createBuilder();	 Catch:{ all -> 0x0360 }
        r8 = (defpackage.avnd) r8;	 Catch:{ all -> 0x0360 }
        r9 = r3.getColumnIndex(r2);	 Catch:{ all -> 0x0360 }
        r9 = defpackage.xbs.a(r3, r9, r15);	 Catch:{ all -> 0x0360 }
        r8.a(r9);	 Catch:{ all -> 0x0360 }
        r9 = "owner_display_name";	 Catch:{ all -> 0x0360 }
        r9 = r3.getColumnIndex(r9);	 Catch:{ all -> 0x0360 }
        r9 = defpackage.xbs.a(r3, r9, r15);	 Catch:{ all -> 0x0360 }
        r8.b(r9);	 Catch:{ all -> 0x0360 }
        r9 = defpackage.aygk.f;	 Catch:{ all -> 0x0360 }
        r8.a(r9);	 Catch:{ all -> 0x0360 }
        r8 = r8.build();	 Catch:{ all -> 0x0360 }
        r8 = (defpackage.anxl) r8;	 Catch:{ all -> 0x0360 }
        r8 = (defpackage.avna) r8;	 Catch:{ all -> 0x0360 }
        r9 = defpackage.avnc.c;	 Catch:{ all -> 0x0360 }
        r9 = r9.createBuilder();	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avnf) r9;	 Catch:{ all -> 0x0360 }
        r9.a(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r8 = r6.instance;	 Catch:{ all -> 0x0360 }
        r8 = (defpackage.avre) r8;	 Catch:{ all -> 0x0360 }
        r9 = r9.build();	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.anxl) r9;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avnc) r9;	 Catch:{ all -> 0x0360 }
        r8.d = r9;	 Catch:{ all -> 0x0360 }
        r9 = r8.a;	 Catch:{ all -> 0x0360 }
        r9 = r9 | 4;	 Catch:{ all -> 0x0360 }
        r8.a = r9;	 Catch:{ all -> 0x0360 }
        r8 = r1.a;	 Catch:{ all -> 0x0360 }
        r9 = r6.a();	 Catch:{ all -> 0x0360 }
        r9 = r9.b;	 Catch:{ all -> 0x0360 }
        if (r9 != 0) goto L_0x023c;	 Catch:{ all -> 0x0360 }
        r9 = defpackage.avna.g;	 Catch:{ all -> 0x0360 }
        r9 = r9.b;	 Catch:{ all -> 0x0360 }
        r10 = r6.a();	 Catch:{ all -> 0x0360 }
        r8.put(r9, r10);	 Catch:{ all -> 0x0360 }
        r8 = "view_count";	 Catch:{ all -> 0x0360 }
        r8 = r3.getColumnIndex(r8);	 Catch:{ all -> 0x0360 }
        r8 = r3.getLong(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r10 = r6.instance;	 Catch:{ all -> 0x0360 }
        r10 = (defpackage.avre) r10;	 Catch:{ all -> 0x0360 }
        r11 = r10.a;	 Catch:{ all -> 0x0360 }
        r11 = r11 | 64;	 Catch:{ all -> 0x0360 }
        r10.a = r11;	 Catch:{ all -> 0x0360 }
        r10.h = r8;	 Catch:{ all -> 0x0360 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0360 }
        r6.copyOnWrite();	 Catch:{ all -> 0x0360 }
        r9 = r6.instance;	 Catch:{ all -> 0x0360 }
        r9 = (defpackage.avre) r9;	 Catch:{ all -> 0x0360 }
        if (r8 == 0) goto L_0x0330;	 Catch:{ all -> 0x0360 }
        r10 = r9.a;	 Catch:{ all -> 0x0360 }
        r10 = r10 | 1024;	 Catch:{ all -> 0x0360 }
        r9.a = r10;	 Catch:{ all -> 0x0360 }
        r9.k = r8;	 Catch:{ all -> 0x0360 }
        r6 = r6.build();	 Catch:{ all -> 0x0360 }
        r6 = (defpackage.anxl) r6;	 Catch:{ all -> 0x0360 }
        r6 = (defpackage.avre) r6;	 Catch:{ all -> 0x0360 }
        if (r5 != 0) goto L_0x0280;	 Catch:{ all -> 0x0360 }
        r4 = 0;	 Catch:{ all -> 0x0360 }
        goto L_0x0323;	 Catch:{ all -> 0x0360 }
        if (r7 == 0) goto L_0x027d;	 Catch:{ all -> 0x0360 }
        if (r6 == 0) goto L_0x027d;	 Catch:{ all -> 0x0360 }
        r4.put(r14, r5);	 Catch:{ all -> 0x0360 }
        r5 = "channel_id";	 Catch:{ all -> 0x0360 }
        r4.put(r5, r7);	 Catch:{ all -> 0x0360 }
        r5 = "offline_video_data_proto";	 Catch:{ all -> 0x0360 }
        r6 = r6.toByteArray();	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        r5 = "deleted";	 Catch:{ all -> 0x0360 }
        r6 = "state";	 Catch:{ all -> 0x0360 }
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x0360 }
        r6 = r3.getString(r6);	 Catch:{ all -> 0x0360 }
        r7 = "OFFLINE_DELETED";	 Catch:{ all -> 0x0360 }
        r6 = android.text.TextUtils.equals(r6, r7);	 Catch:{ all -> 0x0360 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        r5 = "last_playback_timestamp";	 Catch:{ all -> 0x0360 }
        r6 = "last_playback_timestamp";	 Catch:{ all -> 0x0360 }
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x0360 }
        r6 = r3.getLong(r6);	 Catch:{ all -> 0x0360 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        r5 = r3.getColumnIndex(r13);	 Catch:{ all -> 0x0360 }
        r5 = r3.getLong(r5);	 Catch:{ all -> 0x0360 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0360 }
        r4.put(r13, r5);	 Catch:{ all -> 0x0360 }
        r5 = "last_refresh_timestamp";	 Catch:{ all -> 0x0360 }
        r6 = "last_refresh_timestamp";	 Catch:{ all -> 0x0360 }
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x0360 }
        r6 = r3.getLong(r6);	 Catch:{ all -> 0x0360 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        r5 = "media_status";	 Catch:{ all -> 0x0360 }
        r6 = "media_status";	 Catch:{ all -> 0x0360 }
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x0360 }
        r6 = r3.getInt(r6);	 Catch:{ all -> 0x0360 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        r5 = r3.getColumnIndex(r12);	 Catch:{ all -> 0x0360 }
        r5 = r3.getInt(r5);	 Catch:{ all -> 0x0360 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0360 }
        r4.put(r12, r5);	 Catch:{ all -> 0x0360 }
        r5 = "player_response_proto";	 Catch:{ all -> 0x0360 }
        r6 = "player_response_proto";	 Catch:{ all -> 0x0360 }
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x0360 }
        r6 = r3.getBlob(r6);	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        r5 = "refresh_token";	 Catch:{ all -> 0x0360 }
        r6 = "refresh_token";	 Catch:{ all -> 0x0360 }
        r6 = r3.getColumnIndex(r6);	 Catch:{ all -> 0x0360 }
        r6 = r3.getString(r6);	 Catch:{ all -> 0x0360 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0360 }
        if (r4 == 0) goto L_0x032b;	 Catch:{ all -> 0x0360 }
        r5 = "videosV2";	 Catch:{ all -> 0x0360 }
        r6 = 0;	 Catch:{ all -> 0x0360 }
        r0.insertOrThrow(r5, r6, r4);	 Catch:{ all -> 0x0360 }
        r11 = r19;	 Catch:{ all -> 0x0360 }
        r6 = 0;	 Catch:{ all -> 0x0360 }
        goto L_0x0081;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0360 }
        r0.<init>();	 Catch:{ all -> 0x0360 }
        throw r0;	 Catch:{ all -> 0x0360 }
        r0 = move-exception;
        r3.close();
        throw r0;
        r19 = r11;
        r6 = new android.content.ContentValues;	 Catch:{ all -> 0x04cf }
        r6.<init>();	 Catch:{ all -> 0x04cf }
        r7 = r4.getColumnIndex(r14);	 Catch:{ all -> 0x04cf }
        r7 = r4.getString(r7);	 Catch:{ all -> 0x04cf }
        r8 = r4.getColumnIndex(r3);	 Catch:{ all -> 0x04cf }
        r8 = r4.getString(r8);	 Catch:{ all -> 0x04cf }
        r9 = r4.getColumnIndex(r3);	 Catch:{ all -> 0x04cf }
        r9 = defpackage.xbs.a(r4, r9, (java.lang.String) r15);	 Catch:{ all -> 0x04cf }
        r10 = defpackage.avna.g;	 Catch:{ all -> 0x04cf }
        r10 = r10.createBuilder();	 Catch:{ all -> 0x04cf }
        r10 = (defpackage.avnd) r10;	 Catch:{ all -> 0x04cf }
        r10.a(r9);	 Catch:{ all -> 0x04cf }
        r10.b(r9);	 Catch:{ all -> 0x04cf }
        r11 = defpackage.aygk.f;	 Catch:{ all -> 0x04cf }
        r10.a(r11);	 Catch:{ all -> 0x04cf }
        r10 = r10.build();	 Catch:{ all -> 0x04cf }
        r10 = (defpackage.anxl) r10;	 Catch:{ all -> 0x04cf }
        r10 = (defpackage.avna) r10;	 Catch:{ all -> 0x04cf }
        r11 = defpackage.avoq.k;	 Catch:{ all -> 0x04cf }
        r11 = r11.createBuilder();	 Catch:{ all -> 0x04cf }
        r11 = (defpackage.avop) r11;	 Catch:{ all -> 0x04cf }
        r20 = r2;	 Catch:{ all -> 0x04cf }
        r2 = r4.getColumnIndex(r14);	 Catch:{ all -> 0x04cf }
        r2 = defpackage.xbs.a(r4, r2, (java.lang.String) r15);	 Catch:{ all -> 0x04cf }
        r11.a(r2);	 Catch:{ all -> 0x04cf }
        r2 = r19;	 Catch:{ all -> 0x04cf }
        r2 = r4.getColumnIndex(r2);	 Catch:{ all -> 0x04cf }
        r2 = defpackage.xbs.a(r4, r2, (java.lang.String) r15);	 Catch:{ all -> 0x04cf }
        r11.copyOnWrite();	 Catch:{ all -> 0x04cf }
        r19 = r3;	 Catch:{ all -> 0x04cf }
        r3 = r11.instance;	 Catch:{ all -> 0x04cf }
        r3 = (defpackage.avoq) r3;	 Catch:{ all -> 0x04cf }
        if (r2 == 0) goto L_0x04c9;	 Catch:{ all -> 0x04cf }
        r21 = r5;	 Catch:{ all -> 0x04cf }
        r5 = r3.a;	 Catch:{ all -> 0x04cf }
        r5 = r5 | 8;	 Catch:{ all -> 0x04cf }
        r3.a = r5;	 Catch:{ all -> 0x04cf }
        r3.f = r2;	 Catch:{ all -> 0x04cf }
        r2 = "updated_date";	 Catch:{ all -> 0x04cf }
        r2 = r4.getColumnIndex(r2);	 Catch:{ all -> 0x04cf }
        r2 = r4.getLong(r2);	 Catch:{ all -> 0x04cf }
        r17 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x04cf }
        r2 = r2 / r17;	 Catch:{ all -> 0x04cf }
        r11.a(r2);	 Catch:{ all -> 0x04cf }
        r2 = defpackage.aygk.f;	 Catch:{ all -> 0x04cf }
        r11.copyOnWrite();	 Catch:{ all -> 0x04cf }
        r3 = r11.instance;	 Catch:{ all -> 0x04cf }
        r3 = (defpackage.avoq) r3;	 Catch:{ all -> 0x04cf }
        if (r2 == 0) goto L_0x04c3;	 Catch:{ all -> 0x04cf }
        r3.c = r2;	 Catch:{ all -> 0x04cf }
        r2 = r3.a;	 Catch:{ all -> 0x04cf }
        r2 = r2 | 2;	 Catch:{ all -> 0x04cf }
        r3.a = r2;	 Catch:{ all -> 0x04cf }
        r2 = "content_uri";	 Catch:{ all -> 0x04cf }
        r2 = r4.getColumnIndex(r2);	 Catch:{ all -> 0x04cf }
        r2 = defpackage.xbs.a(r4, r2, (java.lang.String) r15);	 Catch:{ all -> 0x04cf }
        r11.copyOnWrite();	 Catch:{ all -> 0x04cf }
        r3 = r11.instance;	 Catch:{ all -> 0x04cf }
        r3 = (defpackage.avoq) r3;	 Catch:{ all -> 0x04cf }
        if (r2 == 0) goto L_0x04bd;	 Catch:{ all -> 0x04cf }
        r5 = r3.a;	 Catch:{ all -> 0x04cf }
        r5 = r5 | 16;	 Catch:{ all -> 0x04cf }
        r3.a = r5;	 Catch:{ all -> 0x04cf }
        r3.g = r2;	 Catch:{ all -> 0x04cf }
        r2 = defpackage.avnc.c;	 Catch:{ all -> 0x04cf }
        r2 = r2.createBuilder();	 Catch:{ all -> 0x04cf }
        r2 = (defpackage.avnf) r2;	 Catch:{ all -> 0x04cf }
        r2.a(r10);	 Catch:{ all -> 0x04cf }
        r11.copyOnWrite();	 Catch:{ all -> 0x04cf }
        r3 = r11.instance;	 Catch:{ all -> 0x04cf }
        r3 = (defpackage.avoq) r3;	 Catch:{ all -> 0x04cf }
        r2 = r2.build();	 Catch:{ all -> 0x04cf }
        r2 = (defpackage.anxl) r2;	 Catch:{ all -> 0x04cf }
        r2 = (defpackage.avnc) r2;	 Catch:{ all -> 0x04cf }
        r3.d = r2;	 Catch:{ all -> 0x04cf }
        r2 = r3.a;	 Catch:{ all -> 0x04cf }
        r2 = r2 | 4;	 Catch:{ all -> 0x04cf }
        r3.a = r2;	 Catch:{ all -> 0x04cf }
        r2 = r11.build();	 Catch:{ all -> 0x04cf }
        r2 = (defpackage.anxl) r2;	 Catch:{ all -> 0x04cf }
        r2 = (defpackage.avoq) r2;	 Catch:{ all -> 0x04cf }
        r3 = r1.a;	 Catch:{ all -> 0x04cf }
        r5 = r2.d;	 Catch:{ all -> 0x04cf }
        if (r5 != 0) goto L_0x0444;	 Catch:{ all -> 0x04cf }
        r5 = defpackage.avnc.c;	 Catch:{ all -> 0x04cf }
        r3.put(r9, r5);	 Catch:{ all -> 0x04cf }
        if (r7 != 0) goto L_0x044b;	 Catch:{ all -> 0x04cf }
        r6 = 0;	 Catch:{ all -> 0x04cf }
        goto L_0x04a3;	 Catch:{ all -> 0x04cf }
        if (r8 == 0) goto L_0x0449;	 Catch:{ all -> 0x04cf }
        r6.put(r14, r7);	 Catch:{ all -> 0x04cf }
        r3 = "channel_id";	 Catch:{ all -> 0x04cf }
        r6.put(r3, r8);	 Catch:{ all -> 0x04cf }
        r3 = "offline_playlist_data_proto";	 Catch:{ all -> 0x04cf }
        r2 = r2.toByteArray();	 Catch:{ all -> 0x04cf }
        r6.put(r3, r2);	 Catch:{ all -> 0x04cf }
        r2 = "placeholder";	 Catch:{ all -> 0x04cf }
        r3 = "placeholder";	 Catch:{ all -> 0x04cf }
        r3 = r4.getColumnIndex(r3);	 Catch:{ all -> 0x04cf }
        r5 = 0;	 Catch:{ all -> 0x04cf }
        r3 = defpackage.xbs.a(r4, r3, r5);	 Catch:{ all -> 0x04cf }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ all -> 0x04cf }
        r6.put(r2, r3);	 Catch:{ all -> 0x04cf }
        r2 = r4.getColumnIndex(r13);	 Catch:{ all -> 0x04cf }
        r2 = r4.getLong(r2);	 Catch:{ all -> 0x04cf }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x04cf }
        r6.put(r13, r2);	 Catch:{ all -> 0x04cf }
        r2 = r4.getColumnIndex(r12);	 Catch:{ all -> 0x04cf }
        r2 = r4.getInt(r2);	 Catch:{ all -> 0x04cf }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x04cf }
        r6.put(r12, r2);	 Catch:{ all -> 0x04cf }
        r2 = "size";	 Catch:{ all -> 0x04cf }
        r3 = "size";	 Catch:{ all -> 0x04cf }
        r3 = r4.getColumnIndex(r3);	 Catch:{ all -> 0x04cf }
        r3 = r4.getInt(r3);	 Catch:{ all -> 0x04cf }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x04cf }
        r6.put(r2, r3);	 Catch:{ all -> 0x04cf }
        if (r6 == 0) goto L_0x04b4;	 Catch:{ all -> 0x04cf }
        r2 = "playlistsV2";	 Catch:{ all -> 0x04cf }
        r3 = 0;	 Catch:{ all -> 0x04cf }
        r0.insertOrThrow(r2, r3, r6);	 Catch:{ all -> 0x04cf }
        r6 = r3;	 Catch:{ all -> 0x04cf }
        r3 = r19;	 Catch:{ all -> 0x04cf }
        r2 = r20;	 Catch:{ all -> 0x04cf }
        r5 = r21;	 Catch:{ all -> 0x04cf }
        goto L_0x003a;	 Catch:{ all -> 0x04cf }
        r3 = r19;	 Catch:{ all -> 0x04cf }
        r2 = r20;	 Catch:{ all -> 0x04cf }
        r5 = r21;	 Catch:{ all -> 0x04cf }
        r6 = 0;	 Catch:{ all -> 0x04cf }
        goto L_0x003a;	 Catch:{ all -> 0x04cf }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x04cf }
        r0.<init>();	 Catch:{ all -> 0x04cf }
        throw r0;	 Catch:{ all -> 0x04cf }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x04cf }
        r0.<init>();	 Catch:{ all -> 0x04cf }
        throw r0;	 Catch:{ all -> 0x04cf }
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x04cf }
        r0.<init>();	 Catch:{ all -> 0x04cf }
        throw r0;	 Catch:{ all -> 0x04cf }
        r0 = move-exception;
        r4.close();
        goto L_0x04d5;
        throw r0;
        goto L_0x04d4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghf.a(android.database.sqlite.SQLiteDatabase):void");
    }
}
