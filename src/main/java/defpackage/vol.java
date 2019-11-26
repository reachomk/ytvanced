package defpackage;

/* renamed from: vol */
public enum vol {
    ADSENSE_SKIPPABLE("AdSense Skippable", "adsenseSkippable"),
    ADSENSE_NONSKIPPABLE("AdSense Nonskippable", "adsenseNonskippable"),
    ADSENSE_VIRAL_SKIPPABLE("Adsense-Viral Skippable", "adsenseViralSkippable"),
    ADSENSE_VIRAL_NONSKIPPABLE("Adsense-Viral Nonskippable", "adsenseViralNonSkippable"),
    FREEWHEEL_AD("FreeWheel Ad", "freewheelVastAd"),
    APP_PROMO_IMMERSIVE("Immersive app promo", "appPromoImmersive_Android"),
    APP_PROMO_IMMERSIVE_PORTRAIT_SCREENSHOTS("Immersive app promo w/ portrait screenshots", "appPromoImmersivePortraitScreenshots_Android"),
    APP_PROMOTION_AD("Ad with App Promotion", "infoCardVastAd"),
    AD_WITH_CTA("Ad with Organic CTA", "ctaVastAd"),
    AD_WITH_INFO_CARD("Ad with Organic Info Cards", "skippableInfoCardVastAd"),
    BRAND_SURVEY("Brand Ad Survey", "surveyVastAd"),
    FORMFILL_MULTIPLE_FIELDS("Formfill ad (Alpha - deprecated)", "formfillMultipleField"),
    FORMFILL_VIRAL_AD_RESPONSE("Formfill ad", "formfillViralAdResponse", 2),
    PRODUCT_LISTING_AD("Product Listing Ad", "plaVastAd"),
    SHOPPING_COMPANION("Ad with Shopping Companion", "trvShoppingVastAd"),
    WEBSITE_ACTION_AD("Ad with website actions", "websiteActionsVast"),
    WEBSITE_ACTION_WITH_STORE_VISITS_AD("Website Actions w/ Store Visits", "websiteActionWithStoreVisits"),
    VERTICAL_AD("Vertical Ad", "adVerticalVastAd"),
    GROUP_ID("Ad Group ID (CAT2 only)", r12),
    URL("Url", r12),
    VIRAL_CAMPAIGN_ID("Viral campaign ID", r12),
    VIRAL_AD_RESPONSE("Viral ad response", r12),
    VIRAL_AD_RESPONSE_URL("Viral ad response URL", r12);
    
    public final String g;
    public final String h;
    public final int i;

    private vol(String str, String str2) {
        this(r7, r8, str, str2, 1);
    }

    public final String toString() {
        return this.g;
    }

    private vol(String str, String str2, int i) {
        this.g = str;
        this.h = str2;
        this.i = i;
    }
}
