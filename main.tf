resource "aws_instance" "flipkart" {
 ami = "ami-01a00762f46d584a1"
}

 resource "aws_s3_bucket" "storage" {
  bucket = var.bucket_name"
  tags = {
  Name = var.project_name
    }
  }
