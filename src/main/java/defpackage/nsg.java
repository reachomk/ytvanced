package defpackage;

/* renamed from: nsg */
public class nsg {
    public static final int A = nxf.c("tfhd");
    public static final int B = nxf.c("trex");
    public static final int C = nxf.c("trun");
    public static final int D = nxf.c("sidx");
    public static final int E = nxf.c("moov");
    public static final int F = nxf.c("mvhd");
    public static final int G = nxf.c("trak");
    public static final int H = nxf.c("mdia");
    public static final int I = nxf.c("minf");
    public static final int J = nxf.c("stbl");
    public static final int K = nxf.c("avcC");
    public static final int L = nxf.c("hvcC");
    public static final int M = nxf.c("esds");
    public static final int N = nxf.c("moof");
    public static final int O = nxf.c("traf");
    public static final int P = nxf.c("mvex");
    public static final int Q = nxf.c("mehd");
    public static final int R = nxf.c("tkhd");
    public static final int S = nxf.c("edts");
    public static final int T = nxf.c("elst");
    public static final int U = nxf.c("mdhd");
    public static final int V = nxf.c("hdlr");
    public static final int W = nxf.c("stsd");
    public static final int X = nxf.c("pssh");
    public static final int Y = nxf.c("sinf");
    public static final int Z = nxf.c("schm");
    public static final int aA = nxf.c("sawb");
    public static final int aB = nxf.c("udta");
    public static final int aC = nxf.c("meta");
    public static final int aD = nxf.c("ilst");
    public static final int aE = nxf.c("mean");
    public static final int aF = nxf.c("name");
    public static final int aG = nxf.c("data");
    public static final int aH = nxf.c("emsg");
    public static final int aI = nxf.c("st3d");
    public static final int aJ = nxf.c("sv3d");
    public static final int aK = nxf.c("proj");
    public static final int aL = nxf.c("vp08");
    public static final int aM = nxf.c("vp09");
    public static final int aN = nxf.c("vpcC");
    public static final int aO = nxf.c("camm");
    public static final int aP = nxf.c("----");
    public static final int aa = nxf.c("schi");
    public static final int ab = nxf.c("tenc");
    public static final int ac = nxf.c("encv");
    public static final int ad = nxf.c("enca");
    public static final int ae = nxf.c("frma");
    public static final int af = nxf.c("saiz");
    public static final int ag = nxf.c("saio");
    public static final int ah = nxf.c("sbgp");
    public static final int ai = nxf.c("sgpd");
    public static final int aj = nxf.c("uuid");
    public static final int ak = nxf.c("senc");
    public static final int al = nxf.c("pasp");
    public static final int am = nxf.c("TTML");
    public static final int an = nxf.c("mp4v");
    public static final int ao = nxf.c("stts");
    public static final int ap = nxf.c("stss");
    public static final int aq = nxf.c("ctts");
    public static final int ar = nxf.c("stsc");
    public static final int as = nxf.c("stsz");
    public static final int at = nxf.c("stz2");
    public static final int au = nxf.c("stco");
    public static final int av = nxf.c("co64");
    public static final int aw = nxf.c("tx3g");
    public static final int ax = nxf.c("wvtt");
    public static final int ay = nxf.c("stpp");
    public static final int az = nxf.c("samr");
    public static final int d = nxf.c("ftyp");
    public static final int e = nxf.c("avc1");
    public static final int f = nxf.c("avc3");
    public static final int g = nxf.c("hvc1");
    public static final int h = nxf.c("hev1");
    public static final int i = nxf.c("s263");
    public static final int j = nxf.c("d263");
    public static final int k = nxf.c("mdat");
    public static final int l = nxf.c("mp4a");
    public static final int m = nxf.c(".mp3");
    public static final int n = nxf.c("wave");
    public static final int o = nxf.c("lpcm");
    public static final int p = nxf.c("sowt");
    public static final int q = nxf.c("ac-3");
    public static final int r = nxf.c("dac3");
    public static final int s = nxf.c("ec-3");
    public static final int t = nxf.c("dec3");
    public static final int u = nxf.c("dtsc");
    public static final int v = nxf.c("dtsh");
    public static final int w = nxf.c("dtsl");
    public static final int x = nxf.c("dtse");
    public static final int y = nxf.c("ddts");
    public static final int z = nxf.c("tfdt");
    public final int aQ;

    public nsg(int i) {
        this.aQ = i;
    }

    public static int c(int i) {
        return i >>> 24;
    }

    public static int d(int i) {
        return i & 16777215;
    }

    public String toString() {
        return nsg.e(this.aQ);
    }

    public static String e(int i) {
        StringBuilder stringBuilder = new StringBuilder(4);
        stringBuilder.append((char) (i >> 24));
        stringBuilder.append((char) ((i >> 16) & 255));
        stringBuilder.append((char) ((i >> 8) & 255));
        stringBuilder.append((char) (i & 255));
        return stringBuilder.toString();
    }

    static {
        nxf.c("vmhd");
    }
}
