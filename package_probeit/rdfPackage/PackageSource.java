package package_probeit.rdfPackage;

import edu.utep.trustlab.visko.installation.packages.RDFPackage;
import edu.utep.trustlab.visko.installation.packages.rdf.PackageViewerSet;
import edu.utep.trustlab.visko.installation.packages.rdf.PackageWriter;
import edu.utep.trustlab.visko.ontology.pmlp.Format;
import edu.utep.trustlab.visko.ontology.viskoOperator.Viewer;

public class PackageSource extends RDFPackage {

	private static final class Resources{
		//formats 
		private static final Format gif = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/GIF.owl#GIF");
		private static final Format png = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/PNG.owl#PNG");
		private static final Format jpeg = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/JPEG.owl#JPEG");
		private static final Format dicom = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/DICOM.owl#DICOM");
		private static final Format tiff = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/TIFF.owl#TIFF");
		private static final Format fits = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/FITS.owl#FITS");
		private static final Format raw = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/RAW.owl#RAW");
		private static final Format stf = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/VNDWTSTF.owl#VNDWTSTF");
		private static final Format pdf = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/PDF.owl#PDF");
		private static final Format plain = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/PLAIN.owl#PLAIN");
		private static final Format plainText = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/PLAINTEXT.owl#PLAINTEXT");
		private static final Format latex = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/VNDLATEXZ.owl#VNDLATEXZ");
		private static final Format html = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/HTML.owl#HTML");
		private static final Format ps = PackageWriter.getFormat("https://raw.github.com/nicholasdelrio/visko/master/resources/formats/POSTSCRIPT.owl#POSTSCRIPT");
		
	}

	@Override
	public void populateServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void populateToolkit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void populateViewerSets() {
		
		PackageViewerSet viewerSet = getPackageWriter().createNewViewerSet("probeit");
		viewerSet.setComment("Probe-It! Provenance Browser");
		viewerSet.setLabel("Probe-It!");
		
		Viewer viewer1 = viewerSet.createNewViewer("probeit-imagej-viewer");
		viewer1.setLabel("ImageJ Viewer");
		viewer1.setComment("ImageJ is a public domain Java image processing program inspired by NIH Image");
		viewer1.addInputFormat(Resources.gif);
		viewer1.addInputFormat(Resources.pdf);
		viewer1.addInputFormat(Resources.jpeg);
		viewer1.addInputFormat(Resources.dicom);
		viewer1.addInputFormat(Resources.tiff);
		viewer1.addInputFormat(Resources.fits);
		viewer1.addInputFormat(Resources.raw);
		viewer1.addInputFormat(Resources.png);
			
		Viewer viewer2 = viewerSet.createNewViewer("parvis-viewer");
		viewer2.setLabel("Parvis Parallel Coordinates Viewer");
		viewer2.setComment("Parvis is a tool for parallel coordinates (PC) visualisation of multidimensional data sets, as first described in [Inselberg 1981].");
		viewer2.addInputFormat(Resources.stf);
		
		Viewer viewer3 = viewerSet.createNewViewer("probeit-pdf-viewer");
		viewer3.setLabel("Adobe Portable Document Format (PDF) Viewer");
		viewer3.setComment("Renders PDF document and allows for zooming.");
		viewer3.addInputFormat(Resources.pdf);
		
		Viewer viewer4 = viewerSet.createNewViewer("probeit-text-viewer");
		viewer4.setLabel("Plain Text Viewer");
		viewer4.setComment("Just a plain old text viewer");
		viewer4.addInputFormat(Resources.plain);
		viewer4.addInputFormat(Resources.plainText);
		viewer4.addInputFormat(Resources.latex);
		viewer4.addInputFormat(Resources.ps);
		
		Viewer viewer5 = viewerSet.createNewViewer("probeit-html-viewer");
		viewer5.setLabel("HyperText Markup Language (HTML) Viewer");
		viewer5.setComment("Renders HTML documents.");
		viewer5.addInputFormat(Resources.html);	
	}

	@Override
	public void populateParameterBindings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getWSDLURL() {
		// TODO Auto-generated method stub
		return null;
	}
}
