package defpackage;

/* renamed from: ogy */
public class ogy {
    public static final int A = ozp.f("ac-3");
    public static final int B = ozp.f("dac3");
    public static final int C = ozp.f("ec-3");
    public static final int D = ozp.f("dec3");
    public static final int E = ozp.f("ac-4");
    public static final int F = ozp.f("dac4");
    public static final int G = ozp.f("dtsc");
    public static final int H = ozp.f("dtsh");
    public static final int I = ozp.f("dtsl");
    public static final int J = ozp.f("dtse");
    public static final int K = ozp.f("ddts");
    public static final int L = ozp.f("tfdt");
    public static final int M = ozp.f("tfhd");
    public static final int N = ozp.f("trex");
    public static final int O = ozp.f("trun");
    public static final int P = ozp.f("sidx");
    public static final int Q = ozp.f("moov");
    public static final int R = ozp.f("mvhd");
    public static final int S = ozp.f("trak");
    public static final int T = ozp.f("mdia");
    public static final int U = ozp.f("minf");
    public static final int V = ozp.f("stbl");
    public static final int W = ozp.f("esds");
    public static final int X = ozp.f("moof");
    public static final int Y = ozp.f("traf");
    public static final int Z = ozp.f("mvex");
    public static final int a = ozp.f("ftyp");
    public static final int aA = ozp.f("ctts");
    public static final int aB = ozp.f("stsc");
    public static final int aC = ozp.f("stsz");
    public static final int aD = ozp.f("stz2");
    public static final int aE = ozp.f("stco");
    public static final int aF = ozp.f("co64");
    public static final int aG = ozp.f("tx3g");
    public static final int aH = ozp.f("wvtt");
    public static final int aI = ozp.f("stpp");
    public static final int aJ = ozp.f("c608");
    public static final int aK = ozp.f("samr");
    public static final int aL = ozp.f("sawb");
    public static final int aM = ozp.f("udta");
    public static final int aN = ozp.f("meta");
    public static final int aO = ozp.f("keys");
    public static final int aP = ozp.f("ilst");
    public static final int aQ = ozp.f("mean");
    public static final int aR = ozp.f("name");
    public static final int aS = ozp.f("data");
    public static final int aT = ozp.f("emsg");
    public static final int aU = ozp.f("st3d");
    public static final int aV = ozp.f("sv3d");
    public static final int aW = ozp.f("proj");
    public static final int aX = ozp.f("camm");
    public static final int aY = ozp.f("alac");
    public static final int aZ = ozp.f("alaw");
    public static final int aa = ozp.f("mehd");
    public static final int ab = ozp.f("tkhd");
    public static final int ac = ozp.f("edts");
    public static final int ad = ozp.f("elst");
    public static final int ae = ozp.f("mdhd");
    public static final int af = ozp.f("hdlr");
    public static final int ag = ozp.f("stsd");
    public static final int ah = ozp.f("pssh");
    public static final int ai = ozp.f("sinf");
    public static final int aj = ozp.f("schm");
    public static final int ak = ozp.f("schi");
    public static final int al = ozp.f("tenc");
    public static final int am = ozp.f("encv");
    public static final int an = ozp.f("enca");
    public static final int ao = ozp.f("frma");
    public static final int ap = ozp.f("saiz");
    public static final int aq = ozp.f("saio");
    public static final int ar = ozp.f("sbgp");
    public static final int as = ozp.f("sgpd");
    public static final int at = ozp.f("uuid");
    public static final int au = ozp.f("senc");
    public static final int av = ozp.f("pasp");
    public static final int aw = ozp.f("TTML");
    public static final int ax = ozp.f("mp4v");
    public static final int ay = ozp.f("stts");
    public static final int az = ozp.f("stss");
    public static final int b = ozp.f("avc1");
    public static final int ba = ozp.f("ulaw");
    public static final int bb = ozp.f("Opus");
    public static final int bc = ozp.f("dOps");
    public static final int bd = ozp.f("fLaC");
    public static final int be = ozp.f("dfLa");
    public static final int c = ozp.f("avc3");
    public static final int d = ozp.f("avcC");
    public static final int e = ozp.f("hvc1");
    public static final int f = ozp.f("hev1");
    public static final int g = ozp.f("hvcC");
    public static final int h = ozp.f("vp08");
    public static final int i = ozp.f("vp09");
    public static final int j = ozp.f("vpcC");
    public static final int k = ozp.f("av01");
    public static final int l = ozp.f("av1C");
    public static final int m = ozp.f("dvav");
    public static final int n = ozp.f("dva1");
    public static final int o = ozp.f("dvhe");
    public static final int p = ozp.f("dvh1");
    public static final int q = ozp.f("dvcC");
    public static final int r = ozp.f("dvvC");
    public static final int s = ozp.f("s263");
    public static final int t = ozp.f("d263");
    public static final int u = ozp.f("mdat");
    public static final int v = ozp.f("mp4a");
    public static final int w = ozp.f(".mp3");
    public static final int x = ozp.f("wave");
    public static final int y = ozp.f("lpcm");
    public static final int z = ozp.f("sowt");
    public final int bf;

    public ogy(int i) {
        this.bf = i;
    }

    public static int a(int i) {
        return i >>> 24;
    }

    public static int b(int i) {
        return i & 16777215;
    }

    public String toString() {
        return ogy.c(this.bf);
    }

    public static String c(int i) {
        StringBuilder stringBuilder = new StringBuilder(4);
        stringBuilder.append((char) (i >>> 24));
        stringBuilder.append((char) ((i >> 16) & 255));
        stringBuilder.append((char) ((i >> 8) & 255));
        stringBuilder.append((char) (i & 255));
        return stringBuilder.toString();
    }

    static {
        ozp.f("vmhd");
    }
}
