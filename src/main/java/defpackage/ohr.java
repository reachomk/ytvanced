package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ohr */
final class ohr {
    private static final int A = ozp.f("sosn");
    private static final int B = ozp.f("tvsh");
    private static final int C = ozp.f("----");
    private static final String[] D = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final int a = ozp.f("nam");
    private static final int b = ozp.f("trk");
    private static final int c = ozp.f("cmt");
    private static final int d = ozp.f("day");
    private static final int e = ozp.f("ART");
    private static final int f = ozp.f("too");
    private static final int g = ozp.f("alb");
    private static final int h = ozp.f("com");
    private static final int i = ozp.f("wrt");
    private static final int j = ozp.f("lyr");
    private static final int k = ozp.f("gen");
    private static final int l = ozp.f("covr");
    private static final int m = ozp.f("gnre");
    private static final int n = ozp.f("grp");
    private static final int o = ozp.f("disk");
    private static final int p = ozp.f("trkn");
    private static final int q = ozp.f("tmpo");
    private static final int r = ozp.f("cpil");
    private static final int s = ozp.f("aART");
    private static final int t = ozp.f("sonm");
    private static final int u = ozp.f("soal");
    private static final int v = ozp.f("soar");
    private static final int w = ozp.f("soaa");
    private static final int x = ozp.f("soco");
    private static final int y = ozp.f("rtng");
    private static final int z = ozp.f("pgap");

    public static nzw a(int i, nzw nzw, olj olj, olj olj2, ofq ofq) {
        if (i == 1) {
            if (ofq.a()) {
                nzw = nzw.a(ofq.a, ofq.b);
            }
            if (olj != null) {
                return nzw.a(olj);
            }
        } else if (i == 2 && olj2 != null) {
            nzw nzw2 = nzw;
            for (int i2 = 0; i2 < olj2.a(); i2++) {
                oll a = olj2.a(i2);
                if (a instanceof ohp) {
                    ohp ohp = (ohp) a;
                    if ("com.android.capture.fps".equals(ohp.a) && ohp.c == 23) {
                        try {
                            nzw2 = nzw2.a(ByteBuffer.wrap(ohp.b).asFloatBuffer().get()).a(new olj(ohp));
                        } catch (NumberFormatException unused) {
                            oyp.a("MetadataUtil", "Ignoring invalid framerate");
                        }
                    }
                }
            }
            nzw = nzw2;
        }
        return nzw;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:204:0x0240=Splitter:B:204:0x0240, B:215:0x0267=Splitter:B:215:0x0267, B:211:0x025d=Splitter:B:211:0x025d} */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0256 A:{Catch:{ all -> 0x02b1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0250 A:{Catch:{ all -> 0x02b1 }} */
    public static defpackage.oll a(defpackage.oza r12) {
        /*
        r0 = r12.b;
        r1 = r12.k();
        r0 = r0 + r1;
        r1 = r12.k();
        r2 = r1 >>> 24;
        r3 = "TCON";
        r4 = "MetadataUtil";
        r5 = 0;
        r6 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        if (r2 != r6) goto L_0x0018;
    L_0x0016:
        goto L_0x01c4;
    L_0x0018:
        r6 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        if (r2 == r6) goto L_0x01c4;
    L_0x001c:
        r2 = m;	 Catch:{ all -> 0x02b1 }
        r6 = -1;
        if (r1 == r2) goto L_0x01a0;
    L_0x0021:
        r2 = o;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x002f;
    L_0x0025:
        r2 = "TPOS";
        r1 = defpackage.ohr.b(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x002f:
        r2 = p;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x003d;
    L_0x0033:
        r2 = "TRCK";
        r1 = defpackage.ohr.b(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x003d:
        r2 = q;	 Catch:{ all -> 0x02b1 }
        r3 = 1;
        r7 = 0;
        if (r1 != r2) goto L_0x004d;
    L_0x0043:
        r2 = "TBPM";
        r1 = defpackage.ohr.a(r1, r2, r12, r3, r7);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x004d:
        r2 = r;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x005b;
    L_0x0051:
        r2 = "TCMP";
        r1 = defpackage.ohr.a(r1, r2, r12, r3, r3);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x005b:
        r2 = l;	 Catch:{ all -> 0x02b1 }
        r8 = 4;
        if (r1 == r2) goto L_0x0148;
    L_0x0060:
        r2 = s;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x006e;
    L_0x0064:
        r2 = "TPE2";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x006e:
        r2 = t;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x007c;
    L_0x0072:
        r2 = "TSOT";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x007c:
        r2 = u;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x008a;
    L_0x0080:
        r2 = "TSO2";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x008a:
        r2 = v;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x0098;
    L_0x008e:
        r2 = "TSOA";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0098:
        r2 = w;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x00a6;
    L_0x009c:
        r2 = "TSOP";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x00a6:
        r2 = x;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x00b4;
    L_0x00aa:
        r2 = "TSOC";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x00b4:
        r2 = y;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x00c2;
    L_0x00b8:
        r2 = "ITUNESADVISORY";
        r1 = defpackage.ohr.a(r1, r2, r12, r7, r7);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x00c2:
        r2 = z;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x00d0;
    L_0x00c6:
        r2 = "ITUNESGAPLESS";
        r1 = defpackage.ohr.a(r1, r2, r12, r7, r3);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x00d0:
        r2 = A;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x00de;
    L_0x00d4:
        r2 = "TVSHOWSORT";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x00de:
        r2 = B;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x00ec;
    L_0x00e2:
        r2 = "TVSHOW";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x00ec:
        r2 = C;	 Catch:{ all -> 0x02b1 }
        if (r1 != r2) goto L_0x0240;
    L_0x00f0:
        r1 = r5;
        r2 = r1;
        r3 = -1;
        r4 = -1;
    L_0x00f4:
        r7 = r12.b;	 Catch:{ all -> 0x02b1 }
        if (r7 >= r0) goto L_0x0129;
    L_0x00f8:
        r9 = r12.k();	 Catch:{ all -> 0x02b1 }
        r10 = r12.k();	 Catch:{ all -> 0x02b1 }
        r12.d(r8);	 Catch:{ all -> 0x02b1 }
        r11 = defpackage.ogy.aQ;	 Catch:{ all -> 0x02b1 }
        if (r10 != r11) goto L_0x010e;
    L_0x0107:
        r9 = r9 + -12;
        r1 = r12.f(r9);	 Catch:{ all -> 0x02b1 }
        goto L_0x00f4;
    L_0x010e:
        r11 = defpackage.ogy.aR;	 Catch:{ all -> 0x02b1 }
        if (r10 != r11) goto L_0x0119;
    L_0x0112:
        r9 = r9 + -12;
        r2 = r12.f(r9);	 Catch:{ all -> 0x02b1 }
        goto L_0x00f4;
    L_0x0119:
        r11 = defpackage.ogy.aS;	 Catch:{ all -> 0x02b1 }
        if (r10 == r11) goto L_0x011e;
    L_0x011d:
        goto L_0x011f;
    L_0x011e:
        r4 = r9;
    L_0x011f:
        if (r10 == r11) goto L_0x0122;
    L_0x0121:
        goto L_0x0123;
    L_0x0122:
        r3 = r7;
    L_0x0123:
        r9 = r9 + -12;
        r12.d(r9);	 Catch:{ all -> 0x02b1 }
        goto L_0x00f4;
    L_0x0129:
        if (r1 != 0) goto L_0x012c;
    L_0x012b:
        goto L_0x0144;
    L_0x012c:
        if (r2 == 0) goto L_0x0144;
    L_0x012e:
        if (r3 != r6) goto L_0x0131;
    L_0x0130:
        goto L_0x0144;
    L_0x0131:
        r12.c(r3);	 Catch:{ all -> 0x02b1 }
        r3 = 16;
        r12.d(r3);	 Catch:{ all -> 0x02b1 }
        r4 = r4 + -16;
        r3 = r12.f(r4);	 Catch:{ all -> 0x02b1 }
        r5 = new omo;	 Catch:{ all -> 0x02b1 }
        r5.<init>(r1, r2, r3);	 Catch:{ all -> 0x02b1 }
    L_0x0144:
        r12.c(r0);
        return r5;
    L_0x0148:
        r1 = r12.k();	 Catch:{ all -> 0x02b1 }
        r2 = r12.k();	 Catch:{ all -> 0x02b1 }
        r3 = defpackage.ogy.aS;	 Catch:{ all -> 0x02b1 }
        if (r2 == r3) goto L_0x015a;
    L_0x0154:
        r1 = "Failed to parse cover art attribute";
        defpackage.oyp.a(r4, r1);	 Catch:{ all -> 0x02b1 }
        goto L_0x019c;
    L_0x015a:
        r2 = r12.k();	 Catch:{ all -> 0x02b1 }
        r2 = defpackage.ogy.b(r2);	 Catch:{ all -> 0x02b1 }
        r3 = 13;
        if (r2 != r3) goto L_0x0169;
    L_0x0166:
        r3 = "image/jpeg";
        goto L_0x0171;
    L_0x0169:
        r3 = 14;
        if (r2 != r3) goto L_0x0170;
    L_0x016d:
        r3 = "image/png";
        goto L_0x0171;
    L_0x0170:
        r3 = r5;
    L_0x0171:
        if (r3 != 0) goto L_0x018a;
    L_0x0173:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02b1 }
        r3 = 41;
        r1.<init>(r3);	 Catch:{ all -> 0x02b1 }
        r3 = "Unrecognized cover art flags: ";
        r1.append(r3);	 Catch:{ all -> 0x02b1 }
        r1.append(r2);	 Catch:{ all -> 0x02b1 }
        r1 = r1.toString();	 Catch:{ all -> 0x02b1 }
        defpackage.oyp.a(r4, r1);	 Catch:{ all -> 0x02b1 }
        goto L_0x019c;
    L_0x018a:
        r12.d(r8);	 Catch:{ all -> 0x02b1 }
        r1 = r1 + -16;
        r1 = new byte[r1];	 Catch:{ all -> 0x02b1 }
        r2 = r1.length;	 Catch:{ all -> 0x02b1 }
        r12.a(r1, r7, r2);	 Catch:{ all -> 0x02b1 }
        r2 = new oly;	 Catch:{ all -> 0x02b1 }
        r4 = 3;
        r2.<init>(r3, r5, r4, r1);	 Catch:{ all -> 0x02b1 }
        r5 = r2;
    L_0x019c:
        r12.c(r0);
        return r5;
    L_0x01a0:
        r1 = defpackage.ohr.b(r12);	 Catch:{ all -> 0x02b1 }
        if (r1 <= 0) goto L_0x01b1;
    L_0x01a6:
        r2 = D;	 Catch:{ all -> 0x02b1 }
        r2 = r2.length;	 Catch:{ all -> 0x02b1 }
        if (r1 > r2) goto L_0x01b1;
    L_0x01ab:
        r2 = D;	 Catch:{ all -> 0x02b1 }
        r1 = r1 + r6;
        r1 = r2[r1];	 Catch:{ all -> 0x02b1 }
        goto L_0x01b2;
    L_0x01b1:
        r1 = r5;
    L_0x01b2:
        if (r1 == 0) goto L_0x01ba;
    L_0x01b4:
        r2 = new omu;	 Catch:{ all -> 0x02b1 }
        r2.<init>(r3, r5, r1);	 Catch:{ all -> 0x02b1 }
        goto L_0x01c0;
    L_0x01ba:
        r1 = "Failed to parse standard genre code";
        defpackage.oyp.a(r4, r1);	 Catch:{ all -> 0x02b1 }
        r2 = r5;
    L_0x01c0:
        r12.c(r0);
        return r2;
    L_0x01c4:
        r2 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r2 = r2 & r1;
        r6 = c;	 Catch:{ all -> 0x02b1 }
        if (r2 == r6) goto L_0x0271;
    L_0x01cc:
        r4 = a;	 Catch:{ all -> 0x02b1 }
        if (r2 == r4) goto L_0x0267;
    L_0x01d0:
        r4 = b;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x01d6;
    L_0x01d4:
        goto L_0x0267;
    L_0x01d6:
        r4 = h;	 Catch:{ all -> 0x02b1 }
        if (r2 == r4) goto L_0x025d;
    L_0x01da:
        r4 = i;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x01e0;
    L_0x01de:
        goto L_0x025d;
    L_0x01e0:
        r4 = d;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x01ee;
    L_0x01e4:
        r2 = "TDRC";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x01ee:
        r4 = e;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x01fc;
    L_0x01f2:
        r2 = "TPE1";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x01fc:
        r4 = f;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x020a;
    L_0x0200:
        r2 = "TSSE";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x020a:
        r4 = g;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x0218;
    L_0x020e:
        r2 = "TALB";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0218:
        r4 = j;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x0226;
    L_0x021c:
        r2 = "USLT";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0226:
        r4 = k;	 Catch:{ all -> 0x02b1 }
        if (r2 != r4) goto L_0x0232;
    L_0x022a:
        r1 = defpackage.ohr.a(r1, r3, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0232:
        r3 = n;	 Catch:{ all -> 0x02b1 }
        if (r2 != r3) goto L_0x0240;
    L_0x0236:
        r2 = "TIT1";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0240:
        r2 = "Skipped unknown metadata entry: ";
        r1 = defpackage.ogy.c(r1);	 Catch:{ all -> 0x02b1 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x02b1 }
        r3 = r1.length();	 Catch:{ all -> 0x02b1 }
        if (r3 != 0) goto L_0x0256;
    L_0x0250:
        r1 = new java.lang.String;	 Catch:{ all -> 0x02b1 }
        r1.<init>(r2);	 Catch:{ all -> 0x02b1 }
        goto L_0x0259;
    L_0x0256:
        r2.concat(r1);	 Catch:{ all -> 0x02b1 }
    L_0x0259:
        r12.c(r0);
        return r5;
    L_0x025d:
        r2 = "TCOM";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0267:
        r2 = "TIT2";
        r1 = defpackage.ohr.a(r1, r2, r12);	 Catch:{ all -> 0x02b1 }
        r12.c(r0);
        return r1;
    L_0x0271:
        r2 = r12.k();	 Catch:{ all -> 0x02b1 }
        r3 = r12.k();	 Catch:{ all -> 0x02b1 }
        r6 = defpackage.ogy.aS;	 Catch:{ all -> 0x02b1 }
        if (r3 != r6) goto L_0x0290;
    L_0x027d:
        r1 = 8;
        r12.d(r1);	 Catch:{ all -> 0x02b1 }
        r2 = r2 + -16;
        r1 = r12.f(r2);	 Catch:{ all -> 0x02b1 }
        r5 = new omg;	 Catch:{ all -> 0x02b1 }
        r2 = "und";
        r5.<init>(r2, r1, r1);	 Catch:{ all -> 0x02b1 }
        goto L_0x02ad;
    L_0x0290:
        r2 = "Failed to parse comment attribute: ";
        r1 = defpackage.ogy.c(r1);	 Catch:{ all -> 0x02b1 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x02b1 }
        r3 = r1.length();	 Catch:{ all -> 0x02b1 }
        if (r3 != 0) goto L_0x02a6;
    L_0x02a0:
        r1 = new java.lang.String;	 Catch:{ all -> 0x02b1 }
        r1.<init>(r2);	 Catch:{ all -> 0x02b1 }
        goto L_0x02aa;
    L_0x02a6:
        r1 = r2.concat(r1);	 Catch:{ all -> 0x02b1 }
    L_0x02aa:
        defpackage.oyp.a(r4, r1);	 Catch:{ all -> 0x02b1 }
    L_0x02ad:
        r12.c(r0);
        return r5;
    L_0x02b1:
        r1 = move-exception;
        r12.c(r0);
        goto L_0x02b7;
    L_0x02b6:
        throw r1;
    L_0x02b7:
        goto L_0x02b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohr.a(oza):oll");
    }

    public static ohp a(oza oza, int i, String str) {
        while (true) {
            int i2 = oza.b;
            if (i2 >= i) {
                return null;
            }
            int k = oza.k();
            if (oza.k() == ogy.aS) {
                i = oza.k();
                i2 = oza.k();
                k -= 16;
                byte[] bArr = new byte[k];
                oza.a(bArr, 0, k);
                return new ohp(str, bArr, i2, i);
            }
            oza.c(i2 + k);
        }
    }

    private static omu a(int i, String str, oza oza) {
        int k = oza.k();
        if (oza.k() == ogy.aS) {
            oza.d(8);
            return new omu(str, null, oza.f(k - 16));
        }
        String valueOf = String.valueOf(ogy.c(i));
        str = "Failed to parse text attribute: ";
        oyp.a("MetadataUtil", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        return null;
    }

    private static omp a(int i, String str, oza oza, boolean z, boolean z2) {
        int b = ohr.b(oza);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String valueOf = String.valueOf(ogy.c(i));
            str = "Failed to parse uint8 attribute: ";
            oyp.a("MetadataUtil", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return null;
        }
        omp omu;
        if (z) {
            omu = new omu(str, null, Integer.toString(b));
        } else {
            omu = new omg("und", str, Integer.toString(b));
        }
        return omu;
    }

    private static omu b(int i, String str, oza oza) {
        String stringBuilder;
        int k = oza.k();
        if (oza.k() == ogy.aS && k >= 22) {
            oza.d(10);
            k = oza.e();
            if (k > 0) {
                StringBuilder stringBuilder2 = new StringBuilder(11);
                stringBuilder2.append(k);
                stringBuilder = stringBuilder2.toString();
                int e = oza.e();
                if (e > 0) {
                    stringBuilder = String.valueOf(stringBuilder);
                    StringBuilder stringBuilder3 = new StringBuilder(stringBuilder.length() + 12);
                    stringBuilder3.append(stringBuilder);
                    stringBuilder3.append("/");
                    stringBuilder3.append(e);
                    stringBuilder = stringBuilder3.toString();
                }
                return new omu(str, null, stringBuilder);
            }
        }
        stringBuilder = String.valueOf(ogy.c(i));
        str = "Failed to parse index/count attribute: ";
        oyp.a("MetadataUtil", stringBuilder.length() == 0 ? new String(str) : str.concat(stringBuilder));
        return null;
    }

    private static int b(oza oza) {
        oza.d(4);
        if (oza.k() == ogy.aS) {
            oza.d(8);
            return oza.d();
        }
        oyp.a("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
