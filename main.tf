resources "AWS_instance" "Flipkart"
 ami = ami-01a00762f46d584a1

 resources "AWS_s3_bucket" "Storage" {
  bucket = var.bucket_name
  tag = {
  Name = var.project_name
    }
  }
