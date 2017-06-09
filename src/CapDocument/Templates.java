package CapDocument;

public class Templates {
	public final static String kmlInfoTemplate = "&lt;Folder&gt;&lt;!-- cap裡一個&lt;alert&gt;可以對應多個&lt;info&gt;，所以用folder把&lt;info&gt;包起來，不同的&lt;info&gt;放在不同的folder --&gt;"
			+ "&lt;name&gt;info&lt;/name&gt;&lt;!-- name固定為info --&gt;"
			+ "&lt;description&gt;&lt;!-- 將&lt;info&gt;內的欄位都放這裡 --&gt;"
			+ "%1$s"
			+ "&lt;/description&gt;"
			+ "%2$s"
			+ "%3$s"
			+ "&lt;/Folder&gt;";

	public final static String kmlAreaTemplate = "&lt;Placemark&gt;&lt;!-- 不同的&lt;area&gt;放在不同的Placemark --&gt;	"
			+ "&lt;name&gt;{0}&lt;/name&gt;&lt;!-- 放&lt;areaDesc&gt; --&gt;"
			+ "&lt;visibility&gt;1&lt;/visibility&gt;"
			+ "&lt;styleUrl&gt;#transBluePoly&lt;/styleUrl&gt;"
			+ "%1$s"
			+ "&lt;description&gt;&lt;!-- &lt;area&gt;裡除了&lt;areaDesc&gt; &lt;polygon&gt; &lt;circle&gt; &lt;geocode&gt;的其他欄位都放這裡 --&gt;"
			+ "%2$s"
			+ "&lt;/description&gt;"
			+ "&lt;/Placemark&gt;";

	public final static String kmlTemplate = "&lt;?xml version=\"1.0\" encoding=\"UTF-8\"?&gt;"
			+ "&lt;kml xmlns=\"http://www.opengis.net/kml/2.2\"&gt;"
			+ "&lt;Document&gt;"
			+ "&lt;Style id=\"transBluePoly\"&gt;&lt;!-- 繪圖所需顏色請參見\"CAP轉KML塗色說明\" --&gt;"
			+ "&lt;LineStyle&gt;"
			+ "&lt;width&gt;1.5&lt;/width&gt;"
			+ "&lt;/LineStyle&gt;"
			+ "&lt;PolyStyle&gt;"
			+ "&lt;color&gt;7dff0000&lt;/color&gt;"
			+ "&lt;/PolyStyle&gt;"
			+ "&lt;/Style&gt;"
			+ "&lt;name&gt;alert&lt;/name&gt;&lt;!-- name固定為alert --&gt;"
			+ "&lt;description&gt;&lt;!-- 將cap裡&lt;alert&gt;內的欄位都放這裡 --&gt;"
			+ "{{alert}}"
			+ "&lt;/description&gt;"
			+ "{{info}}"
			+ "&lt;/Document&gt;"
			+ "&lt;/kml&gt;";
	
	public final static String kmlResourceTemplate = "&lt;description&gt;&lt;!-- 第一個&lt;resource&gt;內的欄位放這裡 --&gt;"
			+ "%1$s"
			+ "&lt;/description&gt;";

	public final static String kmlResourceScopeTemplate = "&lt;Folder&gt;&lt;!-- cap裡一個&lt;info&gt;可以對應多個&lt;resource&gt;，所以用folder把全部的&lt;resource&gt;都包起來，不同的&lt;resource&gt;用description區分，但是都放在同一個folder --&gt;"
			+ "&lt;name&gt;resource&lt;/name&gt;&lt;!-- name固定為resource --&gt;"
			+ "%1$s"
			+ "&lt;/Folder&gt;";

	public final static String kmlAreaScopeTemplate = "&lt;Folder&gt;&lt;!-- cap裡一個&lt;info&gt;可以對應多個&lt;area&gt;，所以用folder把所有的&lt;area&gt;包起來，不同的&lt;area&gt;用底下的Placemark區分，但是都放在同一個folder --&gt;"
			+ "&lt;name&gt;area&lt;/name&gt;&lt;!-- name固定為area --&gt;"
			+ "%1$s"
			+ "&lt;!-- 若一個&lt;area&gt;內有多個&lt;geocode&gt;或&lt;polygon&gt;、&lt;circle&gt;，由於KML的規則在一個placemark內不能有多個polygon，所以要拆成多個placemark --&gt;"
			+ "&lt;!-- 承上，多個&lt;geocode&gt;或&lt;polygon&gt;、&lt;circle&gt;拆成多個placemark時，除了coordinates欄位內容不一樣之外，其他欄位內容都相同 --&gt;"
			+ "&lt;/Folder&gt;";
	
	public final static String geoRssTemplate = "&lt;!-- 可多個CAP轉成一個 GeoRss--&gt;"
			+ "&lt;!-- \"開發者自填\"項目需有介面讓開發者輸入資訊 --&gt;"
			+ "&lt;!-- 開發者需輸入自填項目，並提供CAP檔案(可以多個)，才能轉成一個GeoRss --&gt;"
			+ "&lt;?xml version=\"1.0\" encoding=\"utf-8\"?&gt;"
			+ "&lt;feed xmlns=\"http://www.w3.org/2005/Atom\""
			+ "xmlns:cap=\"urn:oasis:names:tc:emergency:cap:1.2\""
			+ "xmlns:georss=\"http://www.georss.org/georss\""
			+ "xmlns:gml=\"http://www.opengis.net/gml\"&gt;"
			+ "&lt;id&gt;%1$s&lt;/id&gt; &lt;!-- 開發者自填 --&gt;"
			+ "&lt;title&gt;%2$s&lt;/title&gt; &lt;!-- 開發者自填 --&gt;"
			+ "&lt;updated&gt;%3$s&lt;/updated&gt; &lt;!-- 開發者自填 --&gt;"
			+ "&lt;author&gt;"
			+ "&lt;name&gt;%4$s&lt;/name&gt; &lt;!-- 開發者自填 --&gt;"
			+ "&lt;/author&gt;"
			+ "&lt;link&gt;%5$s&lt;/link&gt; &lt;!-- 開發者自填 --&gt;"
			+ "%6$s"
			+ "&lt;/feed&gt;";

	public final static String geoRssItemTemplate = "&lt;entry&gt;&lt;!-- 第一個CAP --&gt;&lt;!--每一個CAP各放在不同的entry--&gt;"
			+ "&lt;id&gt;{{identifier}}&lt;/id&gt; &lt;!-- &lt;identifier&gt; --&gt;"
			+ "&lt;title&gt;{{event}}&lt;/title&gt;&lt;!-- &lt;event&gt; --&gt;"
			+ "&lt;updated&gt;{{sent}}&lt;/updated&gt;&lt;!-- &lt;sent&gt; --&gt;"
			+ "&lt;author&gt;"
			+ "&lt;name&gt;{{sender}}&lt;/name&gt;&lt;!-- &lt;sender&gt; --&gt;"
			+ "&lt;/author&gt;"
			+ "&lt;link  /&gt;&lt;!-- 留白 --&gt;"
			+ "&lt;summary type=\"html\"&gt;&lt;!-- &lt;description&gt; --&gt;"
			+ "{{description}}"
			+ "&lt;/summary&gt;"
			+ "&lt;category term=\"{{event}}\" /&gt;&lt;!-- &lt;event&gt; --&gt;"
			+ "&lt;georss:where&gt;"
			+ "&lt;gml:MultiPolygon srsName=\"EPSG:4326\"&gt;&lt;!-- 不管是不是同一個&lt;info&gt;，所有的&lt;area&gt;的&lt;geocode&gt;、&lt;polygon&gt;或&lt;circle&gt;都轉成polygon放在這一區 --&gt;"
			+ "{{multipolygon}}"
			+ "&lt;/gml:MultiPolygon&gt;"
			+ "&lt;/georss:where&gt;	&lt;/entry&gt;";

	public final static String geoRssItemPolygonTemplate = "&lt;gml:polygonMember&gt;"
			+ "&lt;gml:Polygon&gt;"
			+ "&lt;gml:outerBoundaryIs&gt;"
			+ "&lt;gml:LinearRing&gt;"
			+ "&lt;gml:coordinates&gt;"
			+ "%1$s"
			+ "&lt;/gml:coordinates&gt;"
			+ "&lt;/gml:LinearRing&gt;"
			+ "&lt;/gml:outerBoundaryIs&gt;"
			+ "&lt;/gml:Polygon&gt;"
			+ "&lt;/gml:polygonMember&gt;";

	public final static String geoRssItemGeoCodeTemplate = "&lt;gml:polygonMember&gt;{0}&lt;/gml:polygonMember&gt;";
	
	public final static String kmlAreaPolygonTemplate = "&lt;Polygon&gt;&lt;!-- 放&lt;polygon&gt; 或&lt;geocode&gt;、&lt;circle&gt;轉成的polygon --&gt;"
			+ "&lt;tessellate&gt;1&lt;/tessellate&gt;"
			+ "&lt;altitudeMode&gt;absolute&lt;/altitudeMode&gt;"
			+ "&lt;outerBoundaryIs&gt;"
			+ "&lt;LinearRing&gt;"
			+ "&lt;coordinates&gt;&lt;!-- 下列座標是舉例說明，實際需將cap裡的geocode或circle轉成polygon。高度的設定均為0(貼地表)) --&gt;"
			+ "%1$s"
			+ "&lt;/coordinates&gt;"
			+ "&lt;/LinearRing&gt;"
			+ "&lt;/outerBoundaryIs&gt;"
			+ "&lt;/Polygon&gt;";
	
	public final static String CapTemplate = "&lt;?xml version=\"1.0\" encoding=\"UTF-8\"?&gt;"
			+ "&lt;alert xmlns=\"urn:oasis:names:tc:emergency:cap:1.2\"&gt;"
			+ "{{alert}}"
			+ "{{info}}"
			+ "&lt;/alert&gt;";
}
