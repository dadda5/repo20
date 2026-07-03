resource "aws_instance" "Flipkart" {
 ami = "ami-01a00762f46d584a1"
}

 resource "aws_s3_bucket" "Storage" {
  bucket = var.bucket_name"
  tags = {
  Name = var.project_name
    }
  }
